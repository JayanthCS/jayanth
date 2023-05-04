package com.xworkz.showroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.configuration.ShowRoomConfiguration;
import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.dto.SalesManagerDTO;
import com.xworkz.showroom.dto.ShoeShowroomDTO;
import com.xworkz.showroom.dto.SocksDTO;
import com.xworkz.showroom.service.PolishService;
import com.xworkz.showroom.service.SalesManagerService;
import com.xworkz.showroom.service.ShoeShowroomService;
import com.xworkz.showroom.service.SocksService;

public class ShoeShowroomRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(ShowRoomConfiguration.class);

		ShoeShowroomService serviceImpl = spring.getBean(ShoeShowroomService.class);
		ShoeShowroomDTO dto = new ShoeShowroomDTO(1, "Aneesh Shoe Company", "Dubai", "GST 007");
		boolean saved = serviceImpl.validateAndSave(dto);
		System.out.println("saved " + saved);

		PolishService polishServiceImpl = spring.getBean(PolishService.class);
		PolishDTO dto1 = new PolishDTO("Puma");
		boolean saved1 = polishServiceImpl.validateAndSave(dto1);
		System.out.println("Saved :" + saved1);

		SalesManagerService managerService = spring.getBean(SalesManagerService.class);
		SalesManagerDTO dto2 = new SalesManagerDTO(35, "Ravi");
		boolean saved2 = managerService.validateAndSave(dto2);
		System.out.println("Saved :" + saved2);

		SocksService socksService = spring.getBean(SocksService.class);
		SocksDTO dto3 = new SocksDTO("Puma", "White");
		boolean saved3 = socksService.validateAndSave(dto3);
		System.out.println("Saved :" + saved3);
	}
}
