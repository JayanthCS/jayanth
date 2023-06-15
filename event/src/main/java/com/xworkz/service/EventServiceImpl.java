package com.xworkz.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.dto.EventDTO;
import com.xworkz.entity.EventEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EventServiceImpl implements EventService {

	public EventServiceImpl() {
		log.info("no-arg const of EventServiceImpl");
	}

	@Override
	public boolean validateAndThenSave(EventDTO dto) {
		log.info("Executing validateAndThenSave method");
		EventEntity entity = new EventEntity();
		BeanUtils.copyProperties(dto, entity);
		log.info(" " + entity);

		return true;
	}
}
