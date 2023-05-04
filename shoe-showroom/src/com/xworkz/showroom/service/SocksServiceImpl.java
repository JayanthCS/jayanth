package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SocksDTO;
import com.xworkz.showroom.repo.SocksRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SocksServiceImpl implements SocksService {

	private SocksRepo socksRepo;
	private Validator validator;

	@Override
	public boolean validateAndSave(SocksDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null we can save the data :" + dto);

			Set<ConstraintViolation<SocksDTO>> constraintViolations = this.validator.validate(dto);

			if (!constraintViolations.isEmpty()) {
				System.out.println("Total violation :" + constraintViolations.size());
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + "  " + cv.getMessage()));

			} else {
				return this.socksRepo.save(dto);
			}
		} else {
			System.err.println("dto is null we cannot save");
		}
		return false;
	}

}
