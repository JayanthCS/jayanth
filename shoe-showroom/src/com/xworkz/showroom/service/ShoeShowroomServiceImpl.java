package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowroomDTO;
import com.xworkz.showroom.repo.ShoeShowroomRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowroomServiceImpl implements ShoeShowroomService {

	private ShoeShowroomRepo repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(ShoeShowroomDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null we can save: " + dto);

			Set<ConstraintViolation<ShoeShowroomDTO>> constraintViolations = this.validator.validate(dto);

			if (!constraintViolations.isEmpty()) {
				System.out.println("Total Violation :" + constraintViolations.size());
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			} else {
				return this.repo.save(dto);
			}
		}
		return false;
	}

}
