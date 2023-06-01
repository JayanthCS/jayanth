package com.xworkz.software.repository;

import com.xworkz.software.dto.SoftwareDTO;

public class SoftwareRepositoryImp implements SoftwareRepository {

	SoftwareDTO[] dtos = new SoftwareDTO[5];

	private int index;

	@Override
	public boolean save(SoftwareDTO dto) {

		if (index < dtos.length) {
			dtos[index] = dto;
			index++;
			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean isExist(SoftwareDTO dto) {

		if (index == 0) {
			return false;
		} else {
			for (int index = 0; index < this.index; index++)
				;
			SoftwareDTO temp = dtos[index];
			if (temp.equals(dto)) {
				System.out.println("repo");
				System.out.println("existed in ");
				return true;
			}

		}
		return false;

	}

	@Override
	public int totalSave() {

		return this.index;
	}
	
	

}
