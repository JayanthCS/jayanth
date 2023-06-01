package com.xworkz.software.service;

import com.xworkz.software.dto.SoftwareDTO;

public class SoftwareServiceImp implements SoftwareService {

	@Override
	public boolean validateThenSave(SoftwareDTO dto) {
		System.out.println("started validatating in implementation");

		boolean validId = false;
		boolean validName = false;
		boolean validversion = false;
		boolean validDevelopedBy = false;

		if (dto != null) {

			int id = dto.getId();
			if (id > 0) {
				System.out.println("id is valid" );
				validId=true;
			}
		}

		return false;
		
		if(dto!=null) {
			
			String name=dto.getName();
			if(name!=null && !name.isEmpty()&&name.length()<);
		}
	}
	
	

}
