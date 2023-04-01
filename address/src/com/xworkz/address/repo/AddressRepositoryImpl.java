package com.xworkz.address.repo;

import com.xworkz.address.dto.AddressDTO;
import com.xworkz.address.exception.MemoryFullException;

public class AddressRepositoryImpl implements AddressRepository {

	private AddressDTO addressDTOs[] = new AddressDTO[2];
	private int addressIndex = 0;

	@Override
	public boolean save(AddressDTO repo) throws MemoryFullException{
		if (this.addressIndex < this.addressDTOs.length) {
			addressDTOs[addressIndex] = repo;
			this.addressIndex++;
			System.out.println("Saving is correct");
			return true;
		} else {
			System.err.println("we cannot save");
		}
		throw new MemoryFullException("fsfdsfvzs");
	}

	@Override
	public boolean isExists(AddressDTO repo) {

		if (addressIndex == 0) {
			System.out.println("first element is not exists, we cannot check");
			return false;

		} else {
			System.out.println("First element is exists we can check");
			for (int addressIndex = 0; addressIndex < addressDTOs.length; addressIndex++) {
				AddressDTO ref = this.addressDTOs[addressIndex];
				if (ref.equals(repo)) {
					System.out.println("repo is exists");
					return true;
				} else {
					System.err.println("repo is not exists");
				}
			}
		}
		return false;
	}

	@Override
	public int total() {

		return this.addressIndex;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getNumber() == number) {
				System.out.println("dto is found for number");
				return ref;
			}
		}
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return true;
			}
		}
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getStreet().equals(street)) {
				System.out.println("dto is found for street");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByPincode(int pincode) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getPincode() == pincode) {
				System.out.println("dto is found for pin code");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPincodeAndArea(int pincode, String area, String street) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getPincode() == pincode && ref.getArea().equals(area) && ref.getStreet().equals(street)) {
				System.out.println("dto is found for pincode, area, street");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getCity().equals(city) && ref.getState().equals(state)) {
				System.out.println("dto is found for city and state");
				return ref;
			}
		}
		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getNumber() == number) {
				System.out.println("dto is found for number:" + number);
				int floor = ref.getFloor();
				return floor;
			}
		}
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getNumber() == number && ref.getFloor() == floor && ref.getStreet().equals(street)
					&& ref.getPincode() == pincode) {
				System.out.println("dto is found for number,floor,strret,pincode");
				return ref.getCity();
			}
		}
		return null;
	}

	@Override
	public int findPincodeByNumber(int number) {
		for (int addressIndex = 0; addressIndex < this.addressDTOs.length; addressIndex++) {
			AddressDTO ref = this.addressDTOs[addressIndex];
			if (ref.getNumber() == number) {
				System.out.println("dto is found for number :"+number);
				return ref.getPincode();
			}

		}
		return 0;
	}

}
