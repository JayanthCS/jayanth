package com.xworkz.weapon.boot;

import java.time.LocalDate;

import com.xworkz.weapon.constants.Types;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.service.WeaponService;
import com.xworkz.weapon.service.WeaponServiceImplemets;

public class WeaponRunner {

	public static void main(String[] args) {

		WeaponDTO weapon = new WeaponDTO(1, "Hand Gun", Types.GUN, 400, "Fiber", "Dinakar", "Dinakars Company",
				LocalDate.of(2015, 1, 1), "Jayanth", "Hunting", 400);

		System.out.println(weapon);

		WeaponService weaponService = new WeaponServiceImplemets();
		boolean saved = weaponService.validateAndThenSave(weapon);
		System.out.println("saved :" + saved);
	}
}
