package com.xworkz.policestation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policestation.dto.AmbulanceDTO;
import com.xworkz.policestation.dto.ShowroomDTO;
import com.xworkz.policestation.repository.ShowroomRepo;

public class ShowroomServiceImpl implements ShowroomService {

	private ShowroomRepo showroomRepo;

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

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

			Validator validator = factory.getValidator();
			Set<ConstraintViolation<ShowroomDTO>> constraintViolations = validator.validate(dto);

			System.out.println("Total violation :" + constraintViolations.size());
			constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + "   " + cv.getMessage()));
			if (constraintViolations != null && constraintViolations.isEmpty()) {
				System.out.println("No violation constraints found in dto ");
				return this.showroomRepo.save(dto);
			}

		} else {
			System.err.println("dto is not null we cannot save data");
		}
		return false;
	}
}
