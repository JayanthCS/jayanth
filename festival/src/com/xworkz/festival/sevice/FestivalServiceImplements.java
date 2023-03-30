package com.xworkz.festival.sevice;

import java.time.LocalDate;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.InvalidFestivalException;
import com.xworkz.festival.repo.FestivalRepository;
import com.xworkz.festival.util.ValidateUtil;

public class FestivalServiceImplements implements FestivalSevice {

	private FestivalRepository repo;

	public FestivalServiceImplements(FestivalRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException{
		System.out.println("Running validateAndThenSave() in  FestivalServiceImplements");

		if (dto != null) {

			int id = dto.getId();
			String name = dto.getName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			String sweet = dto.getSweet();
			String godName = dto.getGodName();

			boolean validId = false;
			boolean validName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validSweet = false;
			boolean validGodName = false;

			if (ValidateUtil.validId(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.err.println("invalid id");
			}

			if (ValidateUtil.validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}

			if (ValidateUtil.validDate(startDate)) {
				System.out.println("valid start date");
				validStartDate = true;
			} else {
				System.err.println("invalid start date");
			}

			if (ValidateUtil.validEndDtae(endDate)) {
				System.out.println("valid end date");
				validEndDate = true;
			} else {
				System.err.println("invalid end date");
			}

			if (ValidateUtil.validString(sweet)) {
				System.out.println("valid sweet");
				validSweet = true;
			} else {
				System.err.println("invalid sweet");
			}

			if (ValidateUtil.validString(godName)) {
				System.out.println("valid god name");
				validGodName = true;
			} else {
				System.err.println("invalid god name");
			}

			if (ValidateUtil.validFlag(validId, validName, validStartDate, validEndDate, validSweet, validGodName)) {
				System.out.println("Data is valid , we can save");
				boolean save = this.repo.save(dto);
				return true;
			} else {
				System.err.println("invalid data,we cannot save");
				throw new InvalidFestivalException("Handle the exception");
			}
		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
