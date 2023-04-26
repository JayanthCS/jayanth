package com.xworkz.policestation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policestation.dto.AmbulanceDTO;
import com.xworkz.policestation.dto.ShowroomDTO;
import com.xworkz.policestation.repository.ShowroomRepo;
import com.xworkz.policestation.util.ValidationUtil;

public class ShowroomServiceImpl implements ShowroomService {

	private ShowroomRepo showroomRepo;
	
	private ValidationUtil<ShowroomDTO> validationUtil=new ValidationUtil<>();

	public ShowroomServiceImpl(ShowroomRepo showroomRepo) {
		this.showroomRepo = showroomRepo;
	}

	public ShowroomServiceImpl() {
		System.out.println("no-arg constructor in ShowroomServiceImpl");
	}

	@Override
	public boolean validateAndSave(ShowroomDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null we can save data :" + dto);

			
			
			if (validationUtil.validate(dto)) {
				System.out.println("No violation constraints found in dto ");
				return this.showroomRepo.save(dto);
			}

		} else {
			System.err.println("dto is not null we cannot save data");
		}
		return false;
	}
}
