package com.xworkz.showroom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SalesManagerDTO;

@Component
public class SalesManagerRepoImpl implements SalesManagerRepo {

	private Collection<SalesManagerDTO> dtos = new ArrayList<>();

	public SalesManagerRepoImpl(Collection<SalesManagerDTO> dtos) {
		this.dtos = dtos;
	}

	@Override
	public boolean save(SalesManagerDTO dto) {

		return this.dtos.add(dto);
	}

}
