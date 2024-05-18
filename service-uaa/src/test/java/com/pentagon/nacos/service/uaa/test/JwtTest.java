package com.pentagon.nacos.service.uaa.test;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//@SpringBootTest
public class JwtTest {

//	@Test
//	public void testGenerateToken() {
//		String str = Jwts.builder().claim("name", "John").compact();
//		System.out.println(str);
//	}
	
	public static void main(String[] args) {
		String str = Jwts.builder().claim("name", "John").signWith(SignatureAlgorithm.HS256, "test").compact();
		System.out.println(str);
		Claims claims = Jwts.parser().setSigningKey("test").parseClaimsJws(str).getBody();
		System.out.println(claims.get("name"));
	}
	
}
