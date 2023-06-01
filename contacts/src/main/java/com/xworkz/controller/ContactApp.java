package com.xworkz.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.ContactDTO;

@Component
@RequestMapping("/")
public class ContactApp {

	private Collection<ContactDTO> collectionDtos = new ArrayList();

	public ContactApp() {
		System.out.println("no-arg constructor of ContactController");
	}

	@RequestMapping("/save")
	public String send(ContactDTO dto, Model model) {
		System.out.println("Running send Method");
		System.out.println(dto);
		model.addAttribute("msg", "saved successfully...." + dto.getName());

		this.collectionDtos.add(dto);
		for (ContactDTO contactDTO : collectionDtos) {
			System.out.println("Contact saved in collection:" + contactDTO);
		}
		
		return "display.jsp";
	}
}
