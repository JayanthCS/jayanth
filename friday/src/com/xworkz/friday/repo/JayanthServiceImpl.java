package com.xworkz.friday.repo;

import com.xworkz.friday.dto.JayanthDTO;
import static com.xworkz.friday.util.ValidateUtil.*;

import java.util.Collection;

public class JayanthServiceImpl implements JayanthService {

	private JayanthRepo jayanthRepo;

	public JayanthServiceImpl(JayanthRepo jayanthRepo) {
		this.jayanthRepo = jayanthRepo;
	}

	@Override
	public boolean validateAndSave(JayanthDTO dto) {

		if (dto != null) {
			System.out.println("dto is not null");

			boolean validName = false;
			boolean validGender = false;
			boolean validAge = false;
			boolean validHeight = false;
			boolean validPlace = false;
			boolean validQualification = false;
			boolean validWeight = false;
			boolean validState = false;
			boolean validDistrict = false;
			boolean validChappalSize = false;

			String name = dto.getName();
			if (validateString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}

			String gender = dto.getGender();
			if (validateString(gender)) {
				System.out.println("valid gender");
				validGender = true;
			} else {
				System.err.println("invalid gender");
			}

			int age = dto.getAge();
			if (validateInt(age)) {
				System.out.println("Age is valid");
				validAge = true;
			} else {
				System.err.println("invalid age");
			}

			int height = dto.getHeight();
			if (validateInt(height)) {
				System.out.println("valid height");
				validHeight = true;
			} else {
				System.err.println("invalid height");
			}

			String place = dto.getPlace();
			if (validateString(place)) {
				System.out.println("valid place");
				validPlace = true;
			} else {
				System.err.println("invalid place");
			}

			String qualification = dto.getQualification();
			if (validateString(qualification)) {
				System.out.println("valid qualification");
				validQualification = true;
			} else {
				System.err.println("invalid qualification");
			}

			int weight = dto.getWeight();
			if (validateInt(weight)) {
				System.out.println("valid weight");
				validWeight = true;
			} else {
				System.err.println("invalid weight");
			}

			String state = dto.getState();
			if (validateString(state)) {
				System.out.println("valid state");
				validState = true;
			} else {
				System.err.println("invalid state");
			}

			String district = dto.getDistrict();
			if (validateString(district)) {
				System.out.println("valid district");
				validDistrict = true;
			} else {
				System.err.println("invalid district");
			}

			int chappalSize = dto.getChappalSize();
			if (validateInt(chappalSize)) {
				System.out.println("valid chappalSize");
				validChappalSize = true;
			} else {
				System.err.println("invalid chappal size");
			}

			if (validFlags(validName, validGender, validAge, validHeight, validPlace, validQualification, validWeight,
					validState, validDistrict, validChappalSize)) {
				System.out.println("data is valid we can save");
				return this.jayanthRepo.save(dto);
			} else {
				System.err.println("data is not valid we cannot save");
			}

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

	@Override
	public Collection<JayanthDTO> findByName(String name) {
		
		return this.jayanthRepo.findByName(name);
	}

}
