package com.xworkz.festival.repo;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.FestivalMemoryFullException;

public class FestivalRepositoryImplements implements FestivalRepository {

	private FestivalDTO[] festivalDTOs = new FestivalDTO[3];
	private int festivalIndex = 0;

	@Override
	public boolean save(FestivalDTO dto) {
		if (festivalIndex < festivalDTOs.length) {
			this.festivalDTOs[festivalIndex] = dto;
			System.out.println("dto saved at index :" + festivalIndex + "  " + dto);
			this.festivalIndex++;
			return true;

		} else {
			System.err.println("memory is full,elements cannot store more");
			throw new FestivalMemoryFullException("handle the exception");
		}
		
	}

}
