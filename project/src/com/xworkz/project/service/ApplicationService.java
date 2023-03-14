package com.xworkz.project.service;

import com.xworkz.project.dto.ApplicationDTO;

public interface ApplicationService{

	boolean validateAndThenSave(ApplicationDTO dto);
}
