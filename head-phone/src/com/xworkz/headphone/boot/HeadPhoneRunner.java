package com.xworkz.headphone.boot;

import java.time.LocalDate;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.TypeAndWeight;
import com.xworkz.headphone.dto.HeadPhoneDTO;
import com.xworkz.headphone.service.HeadPhoneService;
import com.xworkz.headphone.service.HeadPhoneServiceImplements;

public class HeadPhoneRunner {

	public static void main(String[] args) {

		HeadPhoneDTO headPone = new HeadPhoneDTO(Brand.MI, "VS202", 1000, true, Color.BLACK, TypeAndWeight.NECK_BAND,
				"Jayanth", 10, LocalDate.now(), 3);

		System.out.println(headPone);

		HeadPhoneService haedPhoneService = new HeadPhoneServiceImplements();
		boolean saved = haedPhoneService.validateAndThenSave(headPone);
		System.out.println("saved :" + saved);
	}
}
