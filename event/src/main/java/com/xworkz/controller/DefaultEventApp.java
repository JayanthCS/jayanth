package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.EventDTO;
@Component
@RequestMapping("/")
public class DefaultEventApp {

	public DefaultEventApp() {
		System.out.println("No-arg constructor of DefaultEventApp");
	}
	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("Running onStart method");
		model.addAttribute("start", new EventDTO());
		return "welcome.jsp";
	}
}
