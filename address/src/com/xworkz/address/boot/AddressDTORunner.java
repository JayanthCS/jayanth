package com.xworkz.address.boot;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.DataValidException;
import com.xworkz.address.repo.AddressRepository;
import com.xworkz.address.repo.AddressRepositoryImpl;
import com.xworkz.address.service.AddressService;
import com.xworkz.address.service.AddressServiceImpl;

public class AddressDTORunner {

	public static void main(String[] args) {
		
		
		AddressDTO addressDTO=new AddressDTO("5th Block,ShankarNagar", "Rajajinagar", 577101, 23, 12, "Banglore", "Karnataka");
		System.out.println(addressDTO);
		AddressDTO addressDTO1= new AddressDTO("3rd Block,Vijaynagar", "VijayNagar", 577102, 24, 13, "Banglore", "Karnataka");
		System.out.println(addressDTO1);
		AddressRepository addressRepository=new AddressRepositoryImpl();
		
		AddressService addressService=new AddressServiceImpl(addressRepository);
		
		try {
		boolean jay = addressService.validateAndThenSave(addressDTO);
		System.out.println(jay);
		
		boolean jay1=addressService.validateAndThenSave(addressDTO1);
		System.out.println(jay1);
		
		AddressDTO fetchdto=addressService.findByNumber(12);
		System.out.println(fetchdto);
		
		boolean find =addressService.find(addressDTO1);
		System.out.println(find);
		
		AddressDTO findStreet=addressService.findByStreet("3rd Block,Vijaynagar");
		System.out.println(findStreet);
		
		AddressDTO findPincode=addressService.findByPincode(577101);
		System.out.println(findPincode);
		
		AddressDTO findStreetPincodeArea=addressService.findByStreetAndPincodeAndArea(577103, "5th Block,ShankarNagar", "Rajajinagar");
		System.out.println(findStreetPincodeArea);
		
		AddressDTO findCityState =addressService.findByCityAndState("Banglore", "Karnataka");
		System.out.println(findCityState);
		
		int findFloorByNumber=addressService.findFloorByNumber(13);
		System.out.println(findFloorByNumber);
		
		String findCityByNumberAndFloorAndStreetAndPincode =addressService.findCityByNumberAndFloorAndStreetAndPincode(13, 24, "VijayNagar", 577102);
		System.out.println(findCityByNumberAndFloorAndStreetAndPincode);
		
		int findPincodeByNumber =addressService.findPincodeByNumber(12);
		System.out.println(findPincodeByNumber);
		
		
		
		}catch(DataValidException e){
			e.printStackTrace();
		}
		
	}
}
