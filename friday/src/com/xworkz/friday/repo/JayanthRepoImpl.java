package com.xworkz.friday.repo;

import java.util.ArrayList;
import java.util.Collection;

import java.util.stream.Collectors;

import com.xworkz.friday.dto.JayanthDTO;

public class JayanthRepoImpl implements JayanthRepo {

	private Collection<JayanthDTO> jayanthDTOs = new ArrayList<>();

	public JayanthRepoImpl() {
		// TODO Auto-generated constructor stub
	}

	public JayanthRepoImpl(Collection<JayanthDTO> jayanthDTOs) {
		this.jayanthDTOs = jayanthDTOs;
	}

	@Override
	public boolean save(JayanthDTO dto) {

		return this.jayanthDTOs.add(dto);
	}

	@Override
	public Collection<JayanthDTO> findByName(String name) {
//		return null;
		return this.jayanthDTOs.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());

	}

}
