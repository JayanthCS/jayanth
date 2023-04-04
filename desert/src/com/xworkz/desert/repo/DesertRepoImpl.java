package com.xworkz.desert.repo;

import com.xworkz.desert.dto.DesertDTO;

public class DesertRepoImpl implements DesertRepo {

	private DesertDTO[] desertDTOs = new DesertDTO[23];
	int index = 0;

	public DesertRepoImpl() {
		System.out.println("No-arg constructor in DesertRepoImpl");
	}

	@Override
	public boolean save(DesertDTO repo) {
		if (this.index < this.desertDTOs.length) {
			desertDTOs[index] = repo;
			this.index++;
			System.out.println("Saving is correct");
			return true;
		} else {
			System.err.println("we cannot save");

		}
		return false;

	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ref = this.desertDTOs[index];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			} else {
				System.err.println("dto is not found");
			}
		}
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ref = this.desertDTOs[index];
			if (ref.getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref;
			} else {
				System.err.println("dto is not found for name");
			}
		}
		return null;
	}

	@Override
	public double findAreaByName(String name) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ref = this.desertDTOs[index];
			if (ref.getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref.getArea();
			} else {
				System.err.println("dto is not found for name");
			}
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO ref = this.desertDTOs[index];
			if (ref.getName().equals(name) && ref.getCountry().equals(country) && ref.getArea() == area) {
				System.out.println("dto is foun for name,country and area");
				return ref;
			} else {
				System.err.println("dto is not found for name, country and area");
			}
		}
		return null;
	}

	@Override
	public int total() {

		return this.index;
	}

}
