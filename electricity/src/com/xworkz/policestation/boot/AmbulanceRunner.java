package com.xworkz.policestation.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policestation.dto.AmbulanceDTO;
import com.xworkz.policestation.repository.AmbulanceRepo;
import com.xworkz.policestation.repository.AmbulanceRepoImpl;
import com.xworkz.policestation.service.AmbulanceService;
import com.xworkz.policestation.service.AmbulanceServiceImpl;

public class AmbulanceRunner {

	public static void main(String[] args) {

		Collection<AmbulanceDTO> ambulanceDTOs = new ArrayList<>();

		AmbulanceDTO ambulanceDTO = new AmbulanceDTO(1, 10, 15, "Bommayi", false, "Ganga", LocalDate.of(2010, 4, 1));
		AmbulanceDTO ambulanceDTO1 = new AmbulanceDTO(2, 12, 11, "Yash", false, "Darshan", LocalDate.of(2011, 4, 1));

		AmbulanceRepo ambulanceRepo = new AmbulanceRepoImpl();
		AmbulanceService ambulanceService = new AmbulanceServiceImpl(ambulanceRepo);

		boolean save = ambulanceService.validateAndSave(ambulanceDTO1);
		System.out.println(save);
		boolean save1 = ambulanceService.validateAndSave(ambulanceDTO);
		System.out.println(save1);
	}
}
