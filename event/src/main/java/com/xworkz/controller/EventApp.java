package com.xworkz.controller;

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
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.constant.EventConstant;
import com.xworkz.dto.EventDTO;
import com.xworkz.service.EventService;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class EventApp implements WebMvcConfigurer {

	private Collection<EventDTO> collectionDtos = new ArrayList<>();
	private Set<EventDTO> dtos = new TreeSet<>();

	@Autowired
	private EventService service;

	public EventApp() {
		log.info("no-arg constructor of EventApp");
	}

	@RequestMapping("/save")
	public String save(@Valid EventDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		log.info("Running save method");
//		log.info(dto);
		if (bindingResult.hasErrors()) {
			log.info("event data is invalid");
			List<ObjectError> errors = bindingResult.getAllErrors();
			errors.forEach(ob -> System.err.println(ob.getDefaultMessage()));

			model.addAttribute("error", errors);

			return "welcome.jsp";
		} else {

			log.info("Data is valid");
			log.info("File Recived " + file.getName());
			log.info("File Size" + file.getSize());
			log.info("File Type" + file.getContentType());
			log.info("File bytes" + file.getBytes());

			log.info(" " + dtos);
			dto.setFileName(System.currentTimeMillis() + "   " + file.getOriginalFilename());

			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());

			service.validateAndThenSave(dto);

			File physicalFile = new File(EventConstant.FILE_NAME + dto.getFileName());

			try (OutputStream outputStream = new FileOutputStream(physicalFile)) {
				outputStream.write(file.getBytes());
			}

			this.dtos.add(dto);

			model.addAttribute("msg", "registerd successfully " + dto.getFname());
			this.collectionDtos.add(dto);
			for (EventDTO eventDTO : collectionDtos) {
				log.info("Contact saved in collection:" + eventDTO);
			}
		}
		return "welcome.jsp";
	}

	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, Model model, HttpServletResponse response)
			throws IOException {
		log.info("Running sendImage");
		log.info("FILE NAME " + fileName);
		File file = new File(EventConstant.FILE_NAME + fileName);
		log.info(file.getPath() + "   " + file.getAbsolutePath());
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
//	@GetMapping("list")
//	public String showData(Model model) {
//		log.info("Running showData");
//		model.addAttribute("dtos", this.dtos);
//		return "/display.jsp";
//	}

	@RequestMapping("/saving")
	public String saved(Model model) {
		log.info("Running saved Method");
		model.addAttribute("saving", this.collectionDtos);
		return "display.jsp";
	}

}
