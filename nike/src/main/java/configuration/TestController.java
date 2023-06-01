package configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {

	public TestController() {
		System.out.println("no-arg const....TestController");
	}
	
	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Running onClick Method");
		return "/Landing.jsp";
	}
}
