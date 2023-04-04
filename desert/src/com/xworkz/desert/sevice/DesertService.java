package com.xworkz.desert.sevice;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.exception.DataInvalidException;

public interface DesertService {

	boolean validAndSave(DesertDTO dto) throws DataInvalidException;

	DesertDTO find(DesertDTO dto)throws DataInvalidException;

	DesertDTO findByName(String name)throws DataInvalidException;

	double findAreaByName(String name)throws DataInvalidException;

	DesertDTO findByNameAndCountryAndArea(String name, String country, double area)throws DataInvalidException;

	int total();
}
