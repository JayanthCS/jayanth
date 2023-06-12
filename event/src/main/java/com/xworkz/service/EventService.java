package com.xworkz.service;

import com.xworkz.dto.EventDTO;

public interface EventService {

	boolean validateAndThenSave(EventDTO dto);
}
