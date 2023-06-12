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

import com.xworkz.constant.CricketerConstant;
import com.xworkz.dto.CricketerDTO;
import com.xworkz.service.CricketerService;

@Component
@RequestMapping("/")
public class CricketerApp {

	private Collection<CricketerDTO> collection = new ArrayList<>();
	private Set<CricketerDTO> dtos = new TreeSet<>();
	@Autowired
	private CricketerService service;

	public CricketerApp() {
		// TODO Auto-generated constructor stub
		System.out.println("no-arg const of CricketApp");
	}

	@RequestMapping("/save")
	public String save(@Valid CricketerDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		System.out.println("Running save method");
		if (bindingResult.hasErrors()) {
			System.err.println("Cricketer data is inValid");
			List<ObjectError> errors = bindingResult.getAllErrors();
			errors.forEach(ob -> System.err.println(ob.getDefaultMessage()));

			model.addAttribute("error", errors);
			return "Welcome.jsp";
		} else {
			System.out.println("Cricketer data is valid");
			System.out.println("File Recived " + file.getName());
			System.out.println("File Size" + file.getSize());
			System.out.println("File Type" + file.getContentType());
			System.out.println("File bytes" + file.getBytes());

			System.out.println(dtos);
			dto.setFileName(System.currentTimeMillis() + "  " + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());

			service.validateAndSave(dto);
			File physicalFile = new File(CricketerConstant.FILE_NAME + dto.getFileName());

			try (OutputStream outputStream = new FileOutputStream(physicalFile)) {
				outputStream.write(file.getBytes());
			}
			this.collection.add(dto);
			// this.dtos.add(dto);
			model.addAttribute("msg", "Successfully registered  " + dto.getName());

			for (CricketerDTO cricketerDTO : collection) {
				System.out.println("Details saved in collection:" + cricketerDTO);
			}
		}
		return "Welcome.jsp";
	}

	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, Model model, HttpServletResponse response)
			throws IOException {
		System.out.println("Running sendImage");
		System.out.println("FILE NAME " + fileName);
		File file = new File(CricketerConstant.FILE_NAME + fileName);
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

	@RequestMapping("/saving")
	public String saving(Model model) {
		System.out.println("Running saving method");
		model.addAttribute("saving", this.collection);
		return "DisplayPage.jsp";
	}

}
