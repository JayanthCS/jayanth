package com.xworkz.policestation.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policestation.constant.Location;
import com.xworkz.policestation.dto.ShowroomDTO;
import com.xworkz.policestation.repository.ShowroomRepo;
import com.xworkz.policestation.repository.ShowroomRepoImpl;
import com.xworkz.policestation.service.ShowroomService;
import com.xworkz.policestation.service.ShowroomServiceImpl;

public class ShowroomRunner {

	public static void main(String[] args) {


		ShowroomDTO showroomDTO = new ShowroomDTO(1, "Enfield", Location.BANGLORE, 8105023991L,
				LocalDate.of(2010, 4, 1), false);
		ShowroomDTO showroomDTO1 = new ShowroomDTO(2, "Bajaj", Location.CHIKKAMAGALURU, 9105023991L,
				LocalDate.of(2011, 4, 1), false);

		ShowroomRepo showroomRepo = new ShowroomRepoImpl();
		ShowroomService showroomService = new ShowroomServiceImpl(showroomRepo);

		boolean save = showroomService.validateAndSave(showroomDTO);
		System.out.println(save);
		boolean save1 = showroomService.validateAndSave(showroomDTO1);
		System.out.println(save1);
	}
}
