package com.xworkz.friday.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.friday.dto.JayanthDTO;
import com.xworkz.friday.repo.JayanthRepo;
import com.xworkz.friday.repo.JayanthRepoImpl;
import com.xworkz.friday.repo.JayanthService;
import com.xworkz.friday.repo.JayanthServiceImpl;

public class JayanthRunner {

	public static void main(String[] args) {

		Collection<JayanthDTO> dtos = new ArrayList<>();

		JayanthDTO jayanthDTO = new JayanthDTO("Jayanth", "Male", 24, 6, "Chikkamagaluru", "Engineering", 60,
				"Karnataka", "Chikkamagaluru", 9);
		JayanthDTO jayanthDTO1 = new JayanthDTO("Dinakar", "Male", 22, 6, "Shimogga", "Bca", 68, "Karnataka",
				"Chikkamagaluru", 10);
		JayanthDTO jayanthDTO2 = new JayanthDTO("Darshan", "Male", 23, 6, "Chikkamagaluru", "BCA", 65, "Karnataka",
				"Chikkamagaluru", 9);

		JayanthRepo jayanthRepo = new JayanthRepoImpl();
		JayanthService jayanthService = new JayanthServiceImpl(jayanthRepo);

		boolean save = jayanthService.validateAndSave(jayanthDTO);
		System.out.println(save);
		boolean save1 = jayanthService.validateAndSave(jayanthDTO1);
		System.out.println(save1);
		boolean save2 = jayanthService.validateAndSave(jayanthDTO2);
		System.out.println(save2);
		
		Collection<JayanthDTO> name=jayanthService.findByName("DarsHan");
		System.out.println(name);
			
		}

	
}
