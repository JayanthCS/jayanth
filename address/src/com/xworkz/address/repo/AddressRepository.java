package com.xworkz.address.repo;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.MemoryFullException;

public interface AddressRepository {

	
	public boolean save(AddressDTO repo) throws MemoryFullException;
	
	
	public boolean isExists(AddressDTO repo);
	
	int total();

	AddressDTO findByNumber(int number);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByPincode(int pincode);

	AddressDTO findByStreetAndPincodeAndArea(int pincode, String area, String street);

	AddressDTO findByCityAndState(String city, String state);

	int findFloorByNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode);

	int findPincodeByNumber(int number);
}
