package com.xworkz.policestation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policestation.dto.AmbulanceDTO;

public class AmbulanceRepoImpl implements AmbulanceRepo {

	private Collection<AmbulanceDTO> ambulanceDTOs = new ArrayList<>();

	public AmbulanceRepoImpl(Collection<AmbulanceDTO> ambulanceDTOs) {
		this.ambulanceDTOs = ambulanceDTOs;
	}

	public AmbulanceRepoImpl() {
		System.out.println("no-arg constructor in AmbulanceRepoImpl");
	}

	@Override
	public boolean save(AmbulanceDTO dto) {

		return this.ambulanceDTOs.add(dto);
	}

}
