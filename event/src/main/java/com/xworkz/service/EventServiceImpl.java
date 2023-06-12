package com.xworkz.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.dto.EventDTO;
import com.xworkz.entity.EventEntity;

@Service
public class EventServiceImpl implements EventService{

	public EventServiceImpl() {
		System.out.println("no-arg const of EventServiceImpl");
	}

	@Override
	public boolean validateAndThenSave(EventDTO dto) {
		System.out.println("Executing validateAndThenSave method");
		EventEntity entity = new EventEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(entity);
		
		return true;
	}
}
