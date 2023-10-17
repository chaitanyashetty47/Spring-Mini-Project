package com.example.createjsp.configuration;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.createjsp.servlet.FoodSearch;
import com.example.createjsp.controller.MainController;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
	private final MainController mController;
	
	public ServletConfig(MainController mController) {
		this.mController = mController;
	}

	@Bean
	 public ServletRegistrationBean<FoodSearch> myServletRegistration() {
		FoodSearch foodServlet = new FoodSearch(mController);
		 ServletRegistrationBean<FoodSearch> registration = new ServletRegistrationBean<>(foodServlet,"/food-search/*");
		 return registration;
	 }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
