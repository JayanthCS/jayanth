package com.xworkz.policestation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.policestation.dto.PoliceStationDTO;
import com.xworkz.policestation.repository.PoliceStationRepo;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationRepo policeStationRepo;

	public PoliceStationServiceImpl() {
		System.out.println("no-arg constructor in PoliceStationServiceImpl");
	}

	public PoliceStationServiceImpl(PoliceStationRepo policeStationRepo) {
		this.policeStationRepo = policeStationRepo;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {
		System.out.println("Running validateAndSave method in PoliceStationServiceImpl");
		if (dto != null) {
			System.out.println("Dto is not null, we can save dto:" + dto);

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();// abstraction
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<PoliceStationDTO>> constraintViolations = validator.validate(dto);

			System.out.println("total violation.....:" + constraintViolations.size());
			constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + "   " + cv.getMessage()));
			if (constraintViolations != null && constraintViolations.isEmpty()) {
				System.out.println("No constraints violation found in dto :" + dto);
				return this.policeStationRepo.save(dto);
			}

		} else {
			System.err.println("Dto is null we cannot save dto");
		}

		return false;
	}

}
