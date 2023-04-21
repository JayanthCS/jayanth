package com.xworkz.friday.repo;

import java.util.Collection;

import com.xworkz.friday.dto.JayanthDTO;

public interface JayanthService {

	boolean validateAndSave(JayanthDTO dto);
	
	Collection<JayanthDTO> findByName(String name);
}
