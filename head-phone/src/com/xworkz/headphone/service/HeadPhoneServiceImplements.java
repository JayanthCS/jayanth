package com.xworkz.headphone.service;

import java.time.LocalDate;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.TypeAndWeight;
import com.xworkz.headphone.dto.HeadPhoneDTO;
import com.xworkz.headphone.util.ValidateUtil;

public class HeadPhoneServiceImplements implements HeadPhoneService {

	@Override
	public boolean validateAndThenSave(HeadPhoneDTO dto) {

		System.out.println("Running validateAndThenSave method in HeadPhoneServiceImplements");

		if (dto != null) {

			Brand brand = dto.getBrand();
			String modelNo = dto.getModelNo();
			double price = dto.getPrice();
			boolean bass = dto.isBass();
			Color color = dto.getColor();
			TypeAndWeight weight = dto.getWeight();
			String customerName = dto.getCustomerName();
			int invoiceNo = dto.getInvoiceNo();
			LocalDate mgfDate = dto.getMgfDate();
			int warrantyPeriod = dto.getWarrantyPeriod();

			boolean validBrand = false;
			boolean validModelNo = false;
			boolean validPrice = false;
			boolean validBass = false;
			boolean validColor = false;
			boolean validWeight = false;
			boolean validCustomerName = false;
			boolean validInvoiceNo = false;
			boolean validMgfDate = false;
			boolean validWarrantyPeriod = false;

			if (brand != null) {
				System.out.println("brand is valid");
				validBrand = true;
			} else {
				System.err.println("brand is invalid");
			}

			if (ValidateUtil.validString(modelNo)) {
				System.out.println("modelNo is valid");
				validModelNo = true;
			} else {
				System.err.println("modelNo is invalid");
			}

			if (ValidateUtil.validPrice(price)) {
				System.out.println("price is valid");
				validPrice = true;
			} else {
				System.err.println("price is invalid");
			}

			if (bass) {
				System.out.println("bass is valid");
				validBass = true;

			} else {
				System.err.println("bass is invalid");
			}

			if (color != null) {
				System.out.println("color is valid");
				validColor = true;
			} else {
				System.err.println("color is invalid");
			}

			if (weight != null) {
				System.out.println("weight is valid");
				validWeight = true;
			} else {
				System.err.println("weight is invalid");
			}

			if (ValidateUtil.validString(customerName)) {
				System.out.println("customerName is valid");
				validCustomerName = true;
			} else {
				System.err.println("customerName is invalid");

			}

			if (ValidateUtil.validNumber(invoiceNo)) {
				System.out.println("invoiceNo is valid");
				validInvoiceNo = true;
			} else {
				System.err.println("invoiceNo is invalid");
			}

			if (ValidateUtil.validDate(mgfDate, LocalDate.of(2000, 1, 1))) {
				System.out.println("mgfDate is valid");
				validMgfDate = true;
			} else {
				System.err.println("mgfDate is invalid");
			}

			if (ValidateUtil.validNumber(warrantyPeriod)) {
				System.out.println("warrantyPeriod is valid");
				validWarrantyPeriod = true;
			} else {
				System.err.println("warrantyPeriod is invalid");
			}

			if (ValidateUtil.validFlag(validBrand, validModelNo, validPrice, validBass, validColor, validWeight,
					validCustomerName, validInvoiceNo, validMgfDate, validWarrantyPeriod)) {
				System.out.println("Data is valid , we can save");
				return true;

			} else {
				System.err.println("data is invalid , we cannot save");
			}

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
