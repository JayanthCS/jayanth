package com.xworkz.policestation.boot;

import java.time.LocalDate;

import com.xworkz.policestation.dto.MarriageDTO;
import com.xworkz.policestation.repository.MarriageRepo;
import com.xworkz.policestation.repository.MarriageRepoImpl;
import com.xworkz.policestation.service.MarriageService;
import com.xworkz.policestation.service.MarriageServiceImpl;

public class MarriageRunner {

	public static void main(String[] args) {

		MarriageRepo repository = new MarriageRepoImpl();

		MarriageService service = new MarriageServiceImpl(repository);

		MarriageDTO dto1 = new MarriageDTO(11, "Sanjana", "Sanjay", false, LocalDate.of(2010, 1, 1),
				"VaibhavConvention", 1500, false);
		boolean save1 = service.validateAndSave(dto1);
		System.out.println("DTO1 is saved:" + save1);

		MarriageDTO dto2 = new MarriageDTO(15, "Dharshini", "Darshan", false, LocalDate.of(2022, 5, 3),
				"JhonCovenction", 2000, false);
		boolean save2 = service.validateAndSave(dto2);
		System.out.println("DTO2 is saved:" + save2);
	}
}
