package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.EventDTO;

import lombok.extern.slf4j.Slf4j;
@Component
@RequestMapping("/")
@Slf4j
public class DefaultEventApp {

	public DefaultEventApp() {
		log.info("No-arg constructor of DefaultEventApp");
	}
	@RequestMapping("/start")
	public String onStart(Model model) {
		log.info("Running onStart method");
		model.addAttribute("start", new EventDTO());
		return "welcome.jsp";
	}
}
