package com.xworkz.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.dto.CricketerDTO;
import com.xworkz.entity.CricketerEntity;

@Service
public class CricketerServiceImpl implements CricketerService {

	public CricketerServiceImpl() {
		System.out.println("No-arg const of CricketerServiceImpl");
	}

	@Override
	public boolean validateAndSave(CricketerDTO cricketerDTO) {
		System.out.println("Executing validateAndSave");
		CricketerEntity cricketerEntity = new CricketerEntity();
		BeanUtils.copyProperties(cricketerDTO, cricketerEntity);
		System.out.println(cricketerEntity);
		return true;
	}
}
