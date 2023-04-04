package com.xworkz.desert.boot;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.exception.DataInvalidException;
import com.xworkz.desert.repo.DesertRepo;
import com.xworkz.desert.repo.DesertRepoImpl;
import com.xworkz.desert.sevice.DesertService;
import com.xworkz.desert.sevice.DesertServiceImpl;

public class DesertDTORunner {

	public static void main(String[] args) {

		DesertDTO desertDTO = new DesertDTO(1, "Antarctica", "World", 10, -4, 35);
		System.out.println(desertDTO);
		DesertDTO desertDTO1 = new DesertDTO(2, "Arctic", "World", 11, 5, 26);
		System.out.println(desertDTO1);
		DesertDTO desertDTO2 = new DesertDTO(3, "Sahara", "World", 12, 6, 40);
		System.out.println(desertDTO2);
		DesertDTO desertDTO3 = new DesertDTO(4, "Africa", "World", 13, -2, 29);
		System.out.println(desertDTO3);
		DesertDTO desertDTO4 = new DesertDTO(5, "Great Australian", "World", 14, -4, 39);
		System.out.println(desertDTO4);
		DesertDTO desertDTO5 = new DesertDTO(6, "Arabian desert", "World", 15, 7, 40);
		System.out.println(desertDTO5);
		DesertDTO desertDTO6 = new DesertDTO(7, "Gobi", "World", 4, 8, 45);
		System.out.println(desertDTO6);
		DesertDTO desertDTO7 = new DesertDTO(8, "Kalahri	", "World", 6, -1, 39);
		System.out.println(desertDTO7);
		DesertDTO desertDTO8 = new DesertDTO(9, "Potagonia", "World", 5, -3, 38);
		System.out.println(desertDTO8);
		DesertDTO desertDTO9 = new DesertDTO(10, "Syrian", "World", 7, -3, 30);
		System.out.println(desertDTO9);
		DesertDTO desertDTO10 = new DesertDTO(11, "Grat Basin", "World", 8, 1, 29);
		System.out.println(desertDTO10);
		DesertDTO desertDTO11 = new DesertDTO(12, "Karakum", "World", 9, 15, 19);
		System.out.println(desertDTO11);
		DesertDTO desertDTO12 = new DesertDTO(13, "Great Viktoria", "World", 22, 16, 28);
		System.out.println(desertDTO12);
		DesertDTO desertDTO13 = new DesertDTO(14, "Sonaran", "World", 32, -3, 31);
		System.out.println(desertDTO13);
		DesertDTO desertDTO14 = new DesertDTO(15, "Ogden", "World", 33, 10, 30);
		System.out.println(desertDTO14);
		DesertDTO desertDTO15 = new DesertDTO(16, "Thar", "World", 44, 15, 34);
		System.out.println(desertDTO15);
		DesertDTO desertDTO16 = new DesertDTO(17, "Puntland", "World", 55, 17, 33);
		System.out.println(desertDTO16);
		DesertDTO desertDTO17 = new DesertDTO(18, "Guban", "World", 66, 18, 32);
		System.out.println(desertDTO17);
		DesertDTO desertDTO18 = new DesertDTO(19, "Namib", "World", 77, 4, 40);
		System.out.println(desertDTO18);
		DesertDTO desertDTO19 = new DesertDTO(20, "Registan", "World", 88, 5, 28);
		System.out.println(desertDTO19);
		DesertDTO desertDTO20 = new DesertDTO(21, "Atacama", "World", 99, 6, 26);
		System.out.println(desertDTO20);
		DesertDTO desertDTO21 = new DesertDTO(22, "Dankil", "World", 10, 7, 25);
		System.out.println(desertDTO21);
		DesertDTO desertDTO22 = new DesertDTO(23, "Mojave", "World", 15, 9, 24);
		System.out.println(desertDTO22);

		DesertRepo desertRepo = new DesertRepoImpl();

		DesertService desertService1 = new DesertServiceImpl(desertRepo);
		DesertService desertService2 = new DesertServiceImpl(desertRepo);
		DesertService desertService3 = new DesertServiceImpl(desertRepo);
		DesertService desertService4 = new DesertServiceImpl(desertRepo);
		DesertService desertService5 = new DesertServiceImpl(desertRepo);
		DesertService desertService6 = new DesertServiceImpl(desertRepo);
		DesertService desertService7 = new DesertServiceImpl(desertRepo);
		DesertService desertService8 = new DesertServiceImpl(desertRepo);
		DesertService desertService9 = new DesertServiceImpl(desertRepo);
		DesertService desertService10 = new DesertServiceImpl(desertRepo);
		DesertService desertService11 = new DesertServiceImpl(desertRepo);
		DesertService desertService12 = new DesertServiceImpl(desertRepo);
		DesertService desertService13 = new DesertServiceImpl(desertRepo);
		DesertService desertService14 = new DesertServiceImpl(desertRepo);
		DesertService desertService15 = new DesertServiceImpl(desertRepo);
		DesertService desertService16 = new DesertServiceImpl(desertRepo);
		DesertService desertService17 = new DesertServiceImpl(desertRepo);
		DesertService desertService18 = new DesertServiceImpl(desertRepo);
		DesertService desertService19 = new DesertServiceImpl(desertRepo);
		DesertService desertService20 = new DesertServiceImpl(desertRepo);
		DesertService desertService21 = new DesertServiceImpl(desertRepo);
		DesertService desertService22 = new DesertServiceImpl(desertRepo);
		DesertService desertService23 = new DesertServiceImpl(desertRepo);

		try {
			boolean j1 = desertService1.validAndSave(desertDTO);
			System.out.println(j1);
			boolean j2 = desertService2.validAndSave(desertDTO1);
			System.out.println(j2);
			boolean j3 = desertService3.validAndSave(desertDTO2);
			System.out.println(j3);
			boolean j4 = desertService4.validAndSave(desertDTO3);
			System.out.println(j4);
			boolean j5 = desertService5.validAndSave(desertDTO4);
			System.out.println(j5);
			boolean j6 = desertService6.validAndSave(desertDTO5);
			System.out.println(j6);
			boolean j7 = desertService7.validAndSave(desertDTO6);
			System.out.println(j7);
			boolean j8 = desertService8.validAndSave(desertDTO7);
			System.out.println(j8);
			boolean j9 = desertService9.validAndSave(desertDTO8);
			System.out.println(j9);
			boolean j10 = desertService10.validAndSave(desertDTO9);
			System.out.println(j10);
			boolean j11 = desertService11.validAndSave(desertDTO10);
			System.out.println(j11);
			boolean j12 = desertService12.validAndSave(desertDTO11);
			System.out.println(j12);
			boolean j13 = desertService13.validAndSave(desertDTO12);
			System.out.println(j13);
			boolean j14 = desertService14.validAndSave(desertDTO13);
			System.out.println(j14);
			boolean j15 = desertService15.validAndSave(desertDTO14);
			System.out.println(j15);
			boolean j16 = desertService16.validAndSave(desertDTO15);
			System.out.println(j16);
			boolean j17 = desertService17.validAndSave(desertDTO16);
			System.out.println(j17);
			boolean j18 = desertService18.validAndSave(desertDTO17);
			System.out.println(j18);
			boolean j19 = desertService19.validAndSave(desertDTO18);
			System.out.println(j19);
			boolean j20 = desertService20.validAndSave(desertDTO19);
			System.out.println(j20);
			boolean j21 = desertService21.validAndSave(desertDTO20);
			System.out.println(j21);
			boolean j22 = desertService22.validAndSave(desertDTO21);
			System.out.println(j22);
			boolean j23 = desertService23.validAndSave(desertDTO22);
			System.out.println(j23);

			DesertDTO find = desertService1.find(desertDTO);
			System.out.println(find);
			DesertDTO find1 = desertService4.find(desertDTO3);
			System.out.println(find1);

			DesertDTO find2 = desertService6.find(desertDTO5);
			System.out.println(find2);

			DesertDTO find3 = desertService8.find(desertDTO7);
			System.out.println(find3);

			DesertDTO find4 = desertService9.find(desertDTO8);
			System.out.println(find4);

			DesertDTO find5 = desertService11.find(desertDTO10);
			System.out.println(find5);

			DesertDTO find6 = desertService13.find(desertDTO12);
			System.out.println(find6);

			DesertDTO find7 = desertService16.find(desertDTO15);
			System.out.println(find7);

			DesertDTO find8 = desertService23.find(desertDTO22);
			System.out.println(find8);

			DesertDTO find9 = desertService20.find(desertDTO19);
			System.out.println(find9);

			DesertDTO name = desertService16.findByName("Thar");
			System.out.println(name);
			DesertDTO name1 = desertService18.findByName("Guban");
			System.out.println(name1);
			DesertDTO name2 = desertService20.findByName("Registan");
			System.out.println(name2);
			DesertDTO name3 = desertService22.findByName("Dankil");
			System.out.println(name3);
			DesertDTO name4 = desertService4.findByName("Africa");
			System.out.println(name4);

			double area1 = desertService1.findAreaByName("Antarctica");
			System.out.println(area1);
			double area = desertService16.findAreaByName("Thar");
			System.out.println(area);

			DesertDTO nameCountryArea = desertService20.findByNameAndCountryAndArea("Registan", "World", 88);
			System.out.println(nameCountryArea);
		} catch (DataInvalidException e) {
			System.out.println(e.getMessage());
		}

		int total = desertService1.total();
		System.out.println("Total dto saved are :" + total);

	}
}
