package com.xworkz.headphone.service;

import com.xworkz.headphone.dto.HeadPhoneDTO;

public interface HeadPhoneService {

	boolean validateAndThenSave(HeadPhoneDTO dto);
}
