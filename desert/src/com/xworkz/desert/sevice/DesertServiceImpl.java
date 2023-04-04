package com.xworkz.desert.sevice;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.exception.DataInvalidException;
import com.xworkz.desert.exception.MemoryFullException;
import com.xworkz.desert.repo.DesertRepo;

import static com.xworkz.desert.util.DesertUtil.*;

public class DesertServiceImpl implements DesertService {

	private DesertRepo repo;

	public DesertServiceImpl(DesertRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validAndSave(DesertDTO dto) throws DataInvalidException {
		if (dto != null) {
			System.out.println("dto is not null");

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validArea = false;
			boolean validMinTemp = false;
			boolean validMaxTemp = false;

			int id = dto.getId();
			if (validInt(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.err.println("invalid id");
			}

			String name = dto.getName();
			if (validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}

			String country = dto.getCountry();
			if (validString(country)) {
				System.out.println("valid country");
				validCountry = true;
			} else {
				System.err.println("invalid country");

			}

			double area = dto.getArea();
			if (validDouble(area)) {
				System.out.println("valid area");
				validArea = true;
			} else {
				System.err.println("invalid area");
			}

			double minTemp = dto.getMinTemp();
			if (validDouble(minTemp)) {
				System.out.println("valid minTemp");
				validMinTemp = true;
			} else {
				System.err.println("invalid minTemp");
			}

			double maxTemp = dto.getMaxTemp();
			if (validDouble(maxTemp)) {
				System.out.println("valid maxTemp");
				validMaxTemp = true;
			} else {
				System.err.println("invalid maxTemp");
			}

			if (validFlags(validId, validName, validCountry, validArea, validMinTemp, validMaxTemp)) {
				System.out.println("data is valid , so we can save");
				try {
					boolean save = this.repo.save(dto);
				} catch (MemoryFullException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				return true;

			} else {
				System.err.println("data is invalid we cannot save");
			}

		} else {
			System.err.println("dto is null");
		}
		throw new DataInvalidException("fill correct data");

	}

	@Override
	public DesertDTO find(DesertDTO dto) throws DataInvalidException {
		if (dto != null) {
			return this.repo.find(dto);
		}
		throw new DataInvalidException("fill correct data");
	}

	@Override
	public DesertDTO findByName(String name) throws DataInvalidException {
		if (validString(name)) {
			return this.repo.findByName(name);
		}
		throw new DataInvalidException("fill correct data");
	}

	@Override
	public double findAreaByName(String name) throws DataInvalidException {
		if (validString(name)) {
			return this.repo.findAreaByName(name);
		}
		throw new DataInvalidException("fill correct data");
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) throws DataInvalidException {
		if (validString(name) && validString(country) && validDouble(area)) {
			return this.repo.findByNameAndCountryAndArea(name, country, area);
		}
		throw new DataInvalidException("fill correct data");
	}

	@Override
	public int total() {

		return this.repo.total();
	}

}
