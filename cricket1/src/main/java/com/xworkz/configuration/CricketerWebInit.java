package com.xworkz.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.constant.CricketerConstant;

public class CricketerWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public CricketerWebInit() {
		System.out.println("No-arg constructor of CricketerWebInit");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Runnig getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Runnig getServletConfigClasses");
		return new Class[] {CricketerConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Runnig getServletMappings");
		return new String[] {"/"};
	}
	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize=800000000;
		MultipartConfigElement configElement = new MultipartConfigElement(CricketerConstant.TEMP_FILE_NAME, maxSize, maxSize*2, maxSize/2);
		registration.setMultipartConfig(configElement);
	}
	
	
}
