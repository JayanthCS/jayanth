package com.xworkz.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.entity.ParkingEntity;

public interface ParkingRepo {

	default List<ParkingEntity> findAll(){
		return null;
	}
	
	ParkingEntity findByEmail(String mail);
	
	boolean updateByEmail(String email,LocalDateTime loginTime);
}
