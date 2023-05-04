package com.xworkz.showroom.repo;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowroomDTO;


public interface ShoeShowroomRepo {

	boolean save(ShoeShowroomDTO dto);
}
