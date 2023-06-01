package com.xworkz.software.repository;

import com.xworkz.software.dto.SoftwareDTO;

public interface SoftwareRepository {
	
	boolean save(SoftwareDTO dto);
	
	 default boolean isExist(SoftwareDTO dto) {
		return false;
	}
	
	 default int totalSave() {
		return 0;
	}
	 
	 default SoftwareDTO finedById(int id) {
		 return null;
	 }

}
