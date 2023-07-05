package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.AdminParkingInfoDTO;
import com.xworkz.entity.AdminParkingInfoEntity;

public interface AdminParkingInfoService {

	boolean save(AdminParkingInfoDTO dto);

	List<AdminParkingInfoDTO> findByLocation(String location);
	AdminParkingInfoEntity findByAll(String location, String vtype, String vclassification, String term);
}
