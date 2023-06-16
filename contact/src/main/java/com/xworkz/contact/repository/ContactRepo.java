package com.xworkz.contact.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.contact.entity.ContactEntity;

public interface ContactRepo {

	boolean save(ContactEntity entity);
	
	default  List<ContactEntity> findByName(String name){
		return Collections.emptyList();
	}
	
	default Long emailCount(String email) {
		return null;
	}
}
