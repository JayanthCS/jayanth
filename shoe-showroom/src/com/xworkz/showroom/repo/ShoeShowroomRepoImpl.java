package com.xworkz.showroom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowroomDTO;

@Component
public class ShoeShowroomRepoImpl implements ShoeShowroomRepo {

	private Collection<ShoeShowroomDTO> shoeShowroomDTOs = new ArrayList<>();

	public ShoeShowroomRepoImpl(Collection<ShoeShowroomDTO> shoeShowroomDTOs) {
		this.shoeShowroomDTOs = shoeShowroomDTOs;
	}

	public ShoeShowroomRepoImpl() {
		System.out.println("no-arg constructor");
	}

	@Override
	public boolean save(ShoeShowroomDTO dto) {

		return this.shoeShowroomDTOs.add(dto);
	}

}
