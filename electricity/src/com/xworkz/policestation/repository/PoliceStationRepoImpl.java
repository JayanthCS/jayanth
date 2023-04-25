package com.xworkz.policestation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.policestation.dto.PoliceStationDTO;

public class PoliceStationRepoImpl implements PoliceStationRepo{

	private Collection<PoliceStationDTO> policeStationDTOs=new ArrayList<PoliceStationDTO>();
	
	 public PoliceStationRepoImpl() {
		System.out.println("No-arg constructor in PoliceStationRepoImpl");
	}
	
	
	
	public PoliceStationRepoImpl(Collection<PoliceStationDTO> policeStationDTOs) {
		this.policeStationDTOs=policeStationDTOs;
	}
	
	@Override
	public boolean save(PoliceStationDTO dto) {
		
		return this.policeStationDTOs.add(dto);
	}

}
