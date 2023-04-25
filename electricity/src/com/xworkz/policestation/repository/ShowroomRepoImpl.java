package com.xworkz.policestation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policestation.dto.ShowroomDTO;

public class ShowroomRepoImpl implements ShowroomRepo {

	private Collection<ShowroomDTO> showroomDTOs = new ArrayList<>();

	public ShowroomRepoImpl(Collection<ShowroomDTO> showroomDTOs) {
		this.showroomDTOs = showroomDTOs;
	}

	public ShowroomRepoImpl() {
		System.out.println("No-arg constructor in ShowroomRepoImpl");
	}

	@Override
	public boolean save(ShowroomDTO dto) {

		return this.showroomDTOs.add(dto);
	}
}
