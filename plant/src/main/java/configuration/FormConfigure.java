package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc

public class FormConfigure implements WebMvcConfigurer {

	public FormConfigure() {
		System.out.println("no-arg const........");

	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("Running addViewControllers");
		registry.addViewController("/").setViewName("Landing.jsp");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
