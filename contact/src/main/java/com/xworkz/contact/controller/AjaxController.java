package com.xworkz.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.contact.service.ContactService;

@EnableWebMvc
@RestController
@RequestMapping("/")
public class AjaxController {

	@Autowired
	private ContactService service;

	public AjaxController() {
		System.out.println("Runiing in ajax controller");
	}

	@PostMapping(value = "/valid/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String emailValidation(@PathVariable  String email) {
		Long count = this.service.emailCount(email);
		if (count == 0) {
			return "";
		} else {
			return "Email already exist";
		}

	}
}
