package com.xworkz.policestation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policestation.dto.MarriageDTO;

public class MarriageRepoImpl implements MarriageRepo {

	private Collection<MarriageDTO> marriageDTOs = new ArrayList<MarriageDTO>();

	public MarriageRepoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(MarriageDTO dto) {

		return this.marriageDTOs.add(dto);
	}
}
