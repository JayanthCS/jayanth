package com.xworkz.contact.service;

import java.util.Collections;
import java.util.List;

import com.xworkz.contact.dto.ContactDTO;

public interface ContactService {

	boolean validateAndThenSave(ContactDTO dto);
	
	default List<ContactDTO> findByName(String name){
		
		return Collections.emptyList();
	}
	
	default Long emailCount(String email) {
		return null;
	}
}
