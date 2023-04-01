package com.xworkz.address.service;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.DataValidException;

public interface AddressService {

	boolean validateAndThenSave(AddressDTO dto) throws DataValidException;

	int total();

	AddressDTO findByNumber(int number) throws DataValidException;

	boolean find(AddressDTO dto) throws DataValidException;

	AddressDTO findByStreet(String street) throws DataValidException;

	AddressDTO findByPincode(int pincode) throws DataValidException;

	AddressDTO findByStreetAndPincodeAndArea(int pincode, String area, String street) throws DataValidException;

	AddressDTO findByCityAndState(String city, String state) throws DataValidException;

	int findFloorByNumber(int number) throws DataValidException;

	String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode) throws DataValidException;

	int findPincodeByNumber(int number) throws DataValidException;
}
