package com.xworkz.configure;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.constant.EventConstant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EventWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public EventWebInit() {
		log.info("no-arg constructor EventWebInit");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] {EventConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize=800000000;
		MultipartConfigElement configElement = new MultipartConfigElement(EventConstant.TEMP_FILE_NAME, maxSize, maxSize*2, maxSize/2);
		registration.setMultipartConfig(configElement);
	}
	
	
}
