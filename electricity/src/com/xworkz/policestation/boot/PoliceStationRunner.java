package com.xworkz.policestation.boot;


import com.xworkz.policestation.constant.Cell;
import com.xworkz.policestation.dto.PoliceStationDTO;
import com.xworkz.policestation.repository.PoliceStationRepo;
import com.xworkz.policestation.repository.PoliceStationRepoImpl;
import com.xworkz.policestation.service.PoliceStationService;
import com.xworkz.policestation.service.PoliceStationServiceImpl;

public class PoliceStationRunner {

	public static void main(String[] args) {


		PoliceStationDTO dto = new PoliceStationDTO(1, "Central Jail", "Dinakar", Cell.FIVE, "Rajajinagar");
		PoliceStationDTO dto1 = new PoliceStationDTO(2, "KamakshiPalya Station", "Basu", Cell.FOUR, "Kamakshipalya");
		PoliceStationDTO dto2 = new PoliceStationDTO(3, "Malleshwaram police station", "Darshan", Cell.TEN,
				"Malleshwaram");

		PoliceStationRepo policeStationRepo = new PoliceStationRepoImpl();
		PoliceStationService policeStationService = new PoliceStationServiceImpl(policeStationRepo);

		boolean save = policeStationService.validateAndSave(dto);
		System.out.println(save);
		boolean save1 = policeStationService.validateAndSave(dto1);
		System.out.println(save1);
		boolean save2 = policeStationService.validateAndSave(dto2);
		System.out.println(save2);
		
		

	}
}
