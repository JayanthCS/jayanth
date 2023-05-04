package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.repo.PolishRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class PolishServiceImpl implements PolishService {

	private PolishRepo repo;
	private Validator validator;

//	public PolishServiceImpl(PolishRepo repo) {
//		this.repo = repo;
//	}

	@Override
	public boolean validateAndSave(PolishDTO dto) {
		if (dto != null) {
			System.out.println("Dto is not null we can save :" + dto);

			Set<ConstraintViolation<PolishDTO>> constraintViolations = this.validator.validate(dto);

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
