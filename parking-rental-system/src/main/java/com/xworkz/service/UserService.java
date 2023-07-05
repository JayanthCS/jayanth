package com.xworkz.service;

import javax.validation.Valid;

import com.xworkz.dto.UserDTO;
import com.xworkz.dto.UserParkingDTO;

public interface UserService {

	boolean validateAndSave(@Valid UserDTO dto, @Valid UserParkingDTO dtos);
}
