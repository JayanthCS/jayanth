package com.xworkz.contact.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.contact.constant.ContactConstant;
import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")

public class ContactController {

	
	
	@Autowired
	private ContactService contactService;
	
	public ContactController() {
		System.out.println("no-arg const...of ContactController");
	}
	
	@PostMapping("/save")
	public String save(@Valid ContactDTO dto,BindingResult bindingResult,Model model,MultipartFile file) throws IOException {
		System.out.println("Running save method");
		System.out.println("dto :"+dto);
		model.addAttribute("dtos", dto);	
		
		if(bindingResult.hasErrors()) {
			System.err.println("dto is not valid");
			model.addAttribute("errors", bindingResult.getAllErrors());
			bindingResult.getAllErrors().forEach(j->System.out.println(j.getDefaultMessage()));
			return "/Register.jsp";
		}else {
			System.out.println("data is valid");
			System.out.println("File Recived "+file.getName());
			System.out.println("File Size "+file.getSize());
			System.out.println("File Type "+file.getContentType());
			System.out.println("File bytes "+file.getBytes());
			
		
			
			dto.setFileName(System.currentTimeMillis()+"  "+file.getOriginalFilename());
			
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			
			
			
			File physicalFile = new File(ContactConstant.FILE_NAME+dto.getFileName());
			try(OutputStream outputStream= new FileOutputStream(physicalFile)){
				outputStream.write(file.getBytes());
			}
			contactService.validateAndThenSave(dto);
			model.addAttribute("msg", "Registerd successfully");
			return "/Register.jsp";
		}
		
		
	}
}
