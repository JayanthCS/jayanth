package com.xworkz.weapon.service;

import com.xworkz.weapon.dto.WeaponDTO;

public interface WeaponService {

	boolean validateAndThenSave(WeaponDTO dto);
}
