package com.xworkz.friday.repo;

import java.util.Collection;

import com.xworkz.friday.dto.JayanthDTO;

public interface JayanthRepo {

	boolean save(JayanthDTO dto);
	
	Collection<JayanthDTO> findByName(String name);
}
