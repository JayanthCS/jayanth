package com.xworkz.repository;

import com.xworkz.entity.AdminParkingInfoEntity;
import com.xworkz.entity.UserEntity;
import com.xworkz.entity.UserParkingEntity;

public interface UserParkingRepo {

	default UserEntity findByUserEmail(String email) {
		return null;
	}
	
	default boolean saveUserData(UserEntity entity) {
		return false;
	}
	
	default boolean saveUserParkingInfo(UserParkingEntity entity) {
		return false;
	}
	//AdminParkingInfoEntity entityExists(String location, String vehicleType, String vehicleClassification, String term);

	boolean saveInfo(UserParkingEntity entity);

}
