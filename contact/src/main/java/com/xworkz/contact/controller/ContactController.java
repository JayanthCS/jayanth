package com.xworkz.contact.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.contact.constant.ContactConstant;
import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.service.ContactService;


@Component
@RequestMapping("/")

public class ContactController {

	//private Collection<ContactDTO> collection= new ArrayList();
	private Set<ContactDTO> dtos = new TreeSet();
	
	@Autowired
	private ContactService contactService;
	
	public ContactController() {
		System.out.println("no-arg const...of ContactController");
	}
	
	@PostMapping("/save")
	public String save(@Valid ContactDTO dto,BindingResult bindingResult,Model model,MultipartFile file) throws IOException {
		System.out.println("Running save method");
		System.out.println("dto :"+dto);
	//	model.addAttribute("dtos", dto);	
		
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
		this.dtos.add(dto);
		System.out.println("DTOs present in Set:" + dtos);
		contactService.validateAndThenSave(dto);
			
			model.addAttribute("msg", "Registerd successfully");
			/*
			 * this.collection.add(dto); for (ContactDTO contactDto : collection) {
			 * System.out.println("Contact saved in collection:" + contactDto); }
			 */
			return "/Register.jsp";
		}
		
		
	}
	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, Model model, HttpServletResponse response)
			throws IOException {
		System.out.println("Running sendImage");
		System.out.println("FILE NAME " + fileName);
		File file = new File(ContactConstant.FILE_NAME + fileName);
		System.out.println(file.getPath() + "   " + file.getAbsolutePath());
		response.setContentType(contentType);
		OutputStream os = response.getOutputStream();
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[4096];
		int length;
		while ((length = in.read(buffer)) > 0) {
			os.write(buffer, 0, length);
		}
	in.close();
		os.flush();

	}
	
	@GetMapping("/search")
	public String onSend(Model model, String name) {
		System.out.println("Running onSerach method with parameter"+name);
		List<ContactDTO> list= contactService.findByName(name);
		model.addAttribute("lists", list);
		return "/Search.jsp";
	}
	
	@GetMapping("/view")
	public String view(Model model) {
		System.out.println("Running view method");
		model.addAttribute("list", this.dtos);
		return "/ViewDetails.jsp";
	}
}
