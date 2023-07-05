package com.xworkz.repository;

import com.xworkz.entity.UserEntity;

public interface UserRepo {

	boolean saveInfo(UserEntity entity);
	
	UserEntity findByUserEmail(String userEmail);
}
