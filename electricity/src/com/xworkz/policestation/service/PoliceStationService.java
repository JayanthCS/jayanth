package com.xworkz.policestation.service;

import com.xworkz.policestation.dto.PoliceStationDTO;

public interface PoliceStationService {

	boolean validateAndSave(PoliceStationDTO dto);
}
