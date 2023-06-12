package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.CricketerDTO;

@Component
@RequestMapping("/")
public class DefaultCricketerApp {

	public DefaultCricketerApp() {
		System.out.println("No-arg constructor of DefaultCricketerApp");
	}
	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("Running onStart method");
		model.addAttribute("start", new CricketerDTO());
		return "Welcome.jsp";
	}
}
