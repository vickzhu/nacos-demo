package com.pentagon.nacos.service.uaa;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.apache.commons.beanutils.BeanUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils {

	public static String generateToken(Object data, int expireMinutes, PrivateKey privateKey) throws Exception {
		if (data == null) {
			throw new RuntimeException("载荷不能为空");
		}
		JwtBuilder jwtBuilder = Jwts.builder();
		BeanInfo beanInfo = Introspector.getBeanInfo(data.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			String name = propertyDescriptor.getName();
			Object value = propertyDescriptor.getReadMethod().invoke(data);
			if (value != null) {
				jwtBuilder.claim(name, value);
			}
		}
//		jwtBuilder.setExpiration(null);
		jwtBuilder.signWith(SignatureAlgorithm.RS256, privateKey);
		return jwtBuilder.compact();
	}

	public static <T> T getObjectFromToken(String token, PublicKey publicKey, Class<T> beanClass) throws Exception {
		Claims body = Jwts.parser().setSigningKey(publicKey).parseClaimsJws(token).getBody();
		T bean = beanClass.newInstance();
		BeanInfo beanInfo = Introspector.getBeanInfo(beanClass);
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			String name = propertyDescriptor.getName();
			Object value = body.get(name);
			if (value != null) {
				BeanUtils.setProperty(bean, name, value);
			}
		}
		return bean;
	}
}
