package com.pentagon.nacos.service.provider.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pentagon.nacos.service.provider.entity.Company;
import com.pentagon.nacos.service.provider.service.CompanyService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gandalf
 * @since 2024-07-23
 */
@RestController
@RequestMapping("/provider/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;

	@GetMapping("/main")
	public String main(HttpServletRequest request) {
		List<Company> companyList = companyService.list();
		companyList.forEach(company -> System.out.println(company.getStockName()));
		return "My Company";
	}
}
