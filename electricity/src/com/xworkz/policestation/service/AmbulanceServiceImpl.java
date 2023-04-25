package com.xworkz.policestation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policestation.dto.AmbulanceDTO;
import com.xworkz.policestation.repository.AmbulanceRepo;

public class AmbulanceServiceImpl implements AmbulanceService {

	private AmbulanceRepo ambulanceRepo;

	public AmbulanceServiceImpl(AmbulanceRepo ambulanceRepo) {
		this.ambulanceRepo = ambulanceRepo;
	}

	public AmbulanceServiceImpl() {
		System.out.println("No-arg constructor in AmbulanceServiceImpl");
	}

	@Override
	public boolean validateAndSave(AmbulanceDTO dto) {

		if (dto != null) {
			System.out.println("dto is not null we can save data :" + dto);

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

			Validator validator = factory.getValidator();
			Set<ConstraintViolation<AmbulanceDTO>> constraintViolations = validator.validate(dto);

			System.out.println("Total violation :" + constraintViolations.size());
			constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + "   " + cv.getMessage()));
			if (constraintViolations != null && constraintViolations.isEmpty()) {
				System.out.println("No violation constraints found in dto ");
				return this.ambulanceRepo.save(dto);
			}

		} else {
			System.err.println("dto is not null we cannot save data");
		}
		return false;
	}

}
