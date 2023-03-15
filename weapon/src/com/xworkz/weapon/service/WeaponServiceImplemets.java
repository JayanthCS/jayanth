package com.xworkz.weapon.service;

import java.time.LocalDate;

import com.xworkz.weapon.constants.Types;
import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponServiceImplemets implements WeaponService {

	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {

		if (dto != null) {
			System.out.println("Running validateAndThenSave methos in WeaponServiceImplemets");

			int id = dto.getId();
			String name = dto.getName();
			Types type = dto.getTypes();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			String manufacturedBy = dto.getManufacturedBy();
			LocalDate manufacturedYear = dto.getManufacturedYear();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();

			boolean validId = false;
			boolean validName = false;
			boolean validType = false;
			boolean validCost = false;
			boolean validMaterial = false;
			boolean validMadeBy = false;
			boolean validManufacturedBy = false;
			boolean validManufacturedYear = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;

			if (id > 0 && id < 100) {
				System.out.println("id is valid");
				validId = true;
			} else {
				System.err.println("id is invalid");
			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validType = true;
			} else {
				System.err.println("type is invalid");
			}

			if (cost > 100 && cost < 1000) {
				System.out.println("cost is valid");
				validCost = true;
			} else {
				System.err.println("cost is invalid");
			}

			if (material != null && !material.isEmpty() && material.length() > 3 && material.length() < 30) {
				System.out.println("material is valid");
				validMaterial = true;
			} else {
				System.err.println("material is invalid");
			}

			if (madeBy != null && !madeBy.isEmpty() && madeBy.length() > 3 && madeBy.length() < 30) {
				System.out.println("madeBy is valid");
				validMadeBy = true;
			} else {
				System.err.println("madeBy is invalid");
			}

			if (manufacturedBy != null && !manufacturedBy.isEmpty() && manufacturedBy.length() > 3
					&& manufacturedBy.length() < 30) {
				System.out.println("manufacturedBy is valid");
				validManufacturedBy = true;
			} else {
				System.err.println("manufacturedBy is invalid");
			}

			LocalDate date = LocalDate.of(2015, 1, 1);
			if (date != null && date.isAfter(date)) {
				System.out.println("manufacturedYear is valid");
				validManufacturedYear = true;
			} else {
				System.err.println("manufacturedYear is invalid");
			}

			if (usedBy != null && !usedBy.isEmpty() && usedBy.length() > 3 && usedBy.length() < 30) {
				System.out.println("usedBy is valid");
				validUsedBy = true;
			} else {
				System.err.println("usedBy is invalid");
			}

			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 3 && usedFor.length() < 30) {
				System.out.println("usedFor is valid");
				validUsedFor = true;
			} else {
				System.err.println("usedFor is invalid");
			}

			if (weight > 100 && weight < 1000) {
				System.out.println("weight is valid");
				validWeight = true;
			} else {
				System.err.println("weight is invalid");
			}

			if (validId && validName && validType && validCost && validMaterial && validMadeBy && validManufacturedBy
					&& validManufacturedYear && validUsedBy && validUsedFor && validWeight) {
				System.out.println("Weapon is validated , so we can save");
				return true;

			} else {
				System.err.println("Weaopn is not validated , so we cannot save");
			}

		} else {
			System.err.println("dto is null");
		}

		return false;
	}

}
