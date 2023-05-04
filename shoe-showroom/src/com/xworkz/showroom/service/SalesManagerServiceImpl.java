package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SalesManagerDTO;
import com.xworkz.showroom.repo.SalesManagerRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagerService {

	private SalesManagerRepo managerRepo;
	private Validator validator;

	@Override
	public boolean validateAndSave(SalesManagerDTO dto) {

		if (dto != null) {
			System.out.println("Dto is not null we can save :" + dto);

			Set<ConstraintViolation<SalesManagerDTO>> constraintViolations = this.validator.validate(dto);

			if (!constraintViolations.isEmpty()) {
				System.out.println("Total violation :" + constraintViolations.size());
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + "    " + cv.getMessage()));

			} else {
				return this.managerRepo.save(dto);
			}

		} else {
			System.err.println("dto is null we cannot save");
		}

		return false;
	}

}
