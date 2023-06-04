package com.xworkz.controller;

import java.util.ArrayList;

import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.EventDTO;

@Component
@RequestMapping("/")
public class EventApp {

	private Collection<EventDTO> collectionDtos = new ArrayList<>();

	public EventApp() {
		System.out.println("no-arg constructor of EventApp");
	}

	@RequestMapping("/save")
	public String save(EventDTO dto, Model model) {
		System.out.println("Running save method");
		System.out.println(dto);
		model.addAttribute("msg", "registerd successfully " + dto.getFname());
		this.collectionDtos.add(dto);
		for (EventDTO eventDTO : collectionDtos) {
			System.out.println("Contact saved in collection:" + eventDTO);
		}
		return "welcome.jsp";
	}

	@RequestMapping("/saving")
	public String saved(Model model) {
		System.out.println("Running saved Method");
		model.addAttribute("saving", this.collectionDtos);
		return "display.jsp";
	}

}
