package com.xworkz.address.service;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.DataValidException;
import com.xworkz.address.exception.MemoryFullException;
import com.xworkz.address.repo.AddressRepository;
//import com.xworkz.address.repo.AddressRepositoryImpl;
import static com.xworkz.address.util.ValidateUtil.*;

public class AddressServiceImpl implements AddressService {

	private AddressRepository repo;

	public AddressServiceImpl(AddressRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndThenSave(AddressDTO dto) throws DataValidException {
		System.out.println("Running validateAndThenSave() in AddressServiceImpl");

		if (dto != null) {
			System.out.println("dto is not null");

			String street = dto.getStreet();
			String area = dto.getArea();
			int pincode = dto.getPincode();
			int floor = dto.getFloor();
			int number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getState();

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPincode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;

			if (validString(street)) {
				System.out.println("valid street");
				validStreet = true;
			} else {
				System.err.println("invalid street");
			}

			if (validString(area)) {
				System.out.println("valid area");
				validArea = true;
			} else {
				System.err.println("invalid area");
			}

			if (validInt(pincode)) {
				System.out.println("valid pincode");
				validPincode = true;
			} else {
				System.err.println("invalid pincode");
			}

			if (validInt(floor)) {
				System.out.println("valid floor");
				validFloor = true;
			} else {
				System.err.println("invalid floor");
			}

			if (validInt(number)) {
				System.out.println("valid number");
				validNumber = true;
			} else {
				System.err.println("invalid number");
			}

			if (validString(city)) {
				System.out.println("valid city");
				validCity = true;
			} else {
				System.err.println("invalid city");
			}

			if (validString(state)) {
				System.out.println("valid state");
				validState = true;
			} else {
				System.err.println("invalid state");
			}

			if (validFlag(validStreet, validArea, validCity, validFloor, validNumber, validPincode, validState)) {
				System.out.println("Data is valid we can save the data");
				try {
					boolean save = this.repo.save(dto);
					return true;
				} catch (MemoryFullException e) {

				}
			}

		} else {
			System.err.println("dto is null");
		}
		throw new DataValidException("data validation exception");
	}

	@Override
	public int total() {

		return this.repo.total();
	}

	@Override
	public AddressDTO findByNumber(int number) throws DataValidException {
		if (validInt(number)) {
			return this.repo.findByNumber(number);
		}
		throw new DataValidException("DataValidationException for findByNumber");
	}

	@Override
	public boolean find(AddressDTO dto) throws DataValidException {
		if (dto != null) {
			return this.repo.find(dto);
		}
		throw new DataValidException("DataValidationException for find");
	}

	@Override
	public AddressDTO findByStreet(String street) throws DataValidException {
		if (validString(street)) {
			return this.repo.findByStreet(street);
		}
		throw new DataValidException("DataValidationException for findByStreet");
	}

	@Override
	public AddressDTO findByPincode(int pincode) throws DataValidException {
		if (validInt(pincode)) {
			return this.repo.findByPincode(pincode);
		}
		throw new DataValidException("DataValidationException for findByPincode");
	}

	@Override
	public AddressDTO findByStreetAndPincodeAndArea(int pincode, String area, String street) throws DataValidException {
		if (validInt(pincode) && validString(area) && validString(street)) {
			return this.repo.findByStreetAndPincodeAndArea(pincode, area, street);
		}
		throw new DataValidException("DataValidationException for findByPincode");
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) throws DataValidException {
		if (validString(city) && validString(state)) {
			return this.repo.findByCityAndState(city, state);
		}
		throw new DataValidException("DataValidationException for findByCityAndState");
	}

	@Override
	public int findFloorByNumber(int number) throws DataValidException {
		if (validInt(number)) {
			return this.repo.findFloorByNumber(number);
		}
		throw new DataValidException("DataValidationException for findFloorByNumber");
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode)
			throws DataValidException {
		if (validString(street) && validInt(number) && validInt(floor) && validInt(pincode)) {
			return this.repo.findCityByNumberAndFloorAndStreetAndPincode(number, floor, street, pincode);
		}
		throw new DataValidException("DataValidationException for findCityByNumberAndFloorAndStreetAndPincode");
	}

	@Override
	public int findPincodeByNumber(int number) throws DataValidException {
		if (validInt(number)) {
			return this.repo.findPincodeByNumber(number);
		}
		throw new DataValidException("DataValidationException for findPincodeByNumber");
	}

}
