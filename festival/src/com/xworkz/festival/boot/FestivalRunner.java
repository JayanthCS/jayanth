package com.xworkz.festival.boot;

import java.time.LocalDate;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.InvalidFestivalException;
import com.xworkz.festival.repo.FestivalRepository;
import com.xworkz.festival.repo.FestivalRepositoryImplements;
import com.xworkz.festival.sevice.FestivalServiceImplements;
import com.xworkz.festival.sevice.FestivalSevice;

public class FestivalRunner {

	public static void main(String[] args) {
		try {
			FestivalDTO festival = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 3, 28), LocalDate.of(2023, 3, 29),
					"Holge", "Shiva");

			// System.out.println(festival);

			FestivalRepository repo = new FestivalRepositoryImplements();

			FestivalSevice festivalSevice = new FestivalServiceImplements(repo);
			boolean saved = festivalSevice.validateAndThenSave(festival);
			System.out.println("saved :" + saved);

			FestivalDTO festival1 = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 3, 28), LocalDate.of(2023, 3, 29),
					"Holge", "Shiva");
			FestivalSevice festivalSevice1 = new FestivalServiceImplements(repo);
			boolean saved1 = festivalSevice1.validateAndThenSave(festival1);
			System.out.println("saved :" + saved1);

			FestivalDTO festival2 = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 3, 28), LocalDate.of(2023, 3, 29),
					"Holge", "Shiva");
			FestivalSevice festivalSevice2 = new FestivalServiceImplements(repo);
			boolean saved2 = festivalSevice2.validateAndThenSave(festival2);
			System.out.println("saved :" + saved2);

			FestivalDTO festival3 = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 3, 28), LocalDate.of(2023, 3, 29),
					"Holge", "Shiva");
			FestivalSevice festivalSevice3 = new FestivalServiceImplements(repo);
			boolean saved3 = festivalSevice3.validateAndThenSave(festival3);
			System.out.println("saved :" + saved3);
		} catch (InvalidFestivalException e) {
			System.out.println(e.getMessage());
		}
	}
}
