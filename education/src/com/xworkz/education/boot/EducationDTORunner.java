package com.xworkz.education.boot;

import java.time.LocalDate;
import java.util.zip.DataFormatException;

import com.xworkz.education.dto.EducationDTO;
import com.xworkz.education.exception.DataInvalidException;
import com.xworkz.education.repo.EducationRepo;
import com.xworkz.education.repo.EducationRepoImpl;
import com.xworkz.education.service.EducationService;
import com.xworkz.education.service.EducationServiceImpl;

public class EducationDTORunner {

	public static void main(String[] args) {

		EducationDTO educationDTO = new EducationDTO(1, "BE", 89, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Jayanth");
		System.out.println(educationDTO);
		EducationDTO educationDTO1 = new EducationDTO(2, "BCA", 58, "Kuvempu University", LocalDate.of(2018, 7, 1),
				LocalDate.of(2021, 3, 1), 1, "CSE", "Darshan");
		System.out.println(educationDTO1);
		EducationDTO educationDTO2 = new EducationDTO(3, "BE", 85, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Gani");
		System.out.println(educationDTO2);
		EducationDTO educationDTO3 = new EducationDTO(4, "BE", 86, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Gowda");
		System.out.println(educationDTO3);
		EducationDTO educationDTO4 = new EducationDTO(5, "BE", 87, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Shashwath");
		System.out.println(educationDTO4);
		EducationDTO educationDTO5 = new EducationDTO(6, "BCA", 82, "Kuvempu University", LocalDate.of(2018, 7, 13),
				LocalDate.of(2021, 3, 1), 1, "CS", "Dinakar");
		System.out.println(educationDTO5);
		EducationDTO educationDTO6 = new EducationDTO(7, "BE", 75, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Jaysimha");
		System.out.println(educationDTO6);
		EducationDTO educationDTO7 = new EducationDTO(8, "BE", 80, "Mysur University", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "CS", "Kumar");
		System.out.println(educationDTO7);
		EducationDTO educationDTO8 = new EducationDTO(9, "BE", 78, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Mech", "Sanjay");
		System.out.println(educationDTO8);
		EducationDTO educationDTO9 = new EducationDTO(10, "BSC", 88, "Kuvempu University", LocalDate.of(2017, 8, 13),
				LocalDate.of(2020, 7, 1), 1, "Bio", "Deepak");
		System.out.println(educationDTO9);
		EducationDTO educationDTO10 = new EducationDTO(11, "BE", 70, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Ankith");
		System.out.println(educationDTO10);
		EducationDTO educationDTO11 = new EducationDTO(12, "BE", 71, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Vinay");
		System.out.println(educationDTO11);
		EducationDTO educationDTO12 = new EducationDTO(13, "BE", 72, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "IS", "Jainam");
		System.out.println(educationDTO12);
		EducationDTO educationDTO13 = new EducationDTO(14, "BE", 73, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Akash");
		System.out.println(educationDTO13);
		EducationDTO educationDTO14 = new EducationDTO(15, "BE", 74, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "ECE", "Arjun");
		System.out.println(educationDTO14);
		EducationDTO educationDTO15 = new EducationDTO(16, "BE", 75, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Abhi");
		System.out.println(educationDTO15);
		EducationDTO educationDTO16 = new EducationDTO(17, "BE", 76, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Mech", "Raj");
		System.out.println(educationDTO16);
		EducationDTO educationDTO17 = new EducationDTO(18, "BE", 77, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Environment", "Ravi");
		System.out.println(educationDTO17);
		EducationDTO educationDTO18 = new EducationDTO(19, "BE", 78, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "Civil", "Rakshith");
		System.out.println(educationDTO18);
		EducationDTO educationDTO19 = new EducationDTO(20, "BE", 79, "VTU", LocalDate.of(2017, 8, 13),
				LocalDate.of(2021, 7, 1), 1, "EEE", "Pramodh");
		System.out.println(educationDTO19);

		EducationRepo educationRepo = new EducationRepoImpl();

		EducationService educationService = new EducationServiceImpl(educationRepo);
		EducationService educationService1 = new EducationServiceImpl(educationRepo);
		EducationService educationService2 = new EducationServiceImpl(educationRepo);
		EducationService educationService3 = new EducationServiceImpl(educationRepo);
		EducationService educationService4 = new EducationServiceImpl(educationRepo);
		EducationService educationService5 = new EducationServiceImpl(educationRepo);
		EducationService educationService6 = new EducationServiceImpl(educationRepo);
		EducationService educationService7 = new EducationServiceImpl(educationRepo);
		EducationService educationService8 = new EducationServiceImpl(educationRepo);
		EducationService educationService9 = new EducationServiceImpl(educationRepo);
		EducationService educationService10 = new EducationServiceImpl(educationRepo);
		EducationService educationService11 = new EducationServiceImpl(educationRepo);
		EducationService educationService12 = new EducationServiceImpl(educationRepo);
		EducationService educationService13 = new EducationServiceImpl(educationRepo);
		EducationService educationService14 = new EducationServiceImpl(educationRepo);
		EducationService educationService15 = new EducationServiceImpl(educationRepo);
		EducationService educationService16 = new EducationServiceImpl(educationRepo);
		EducationService educationService17 = new EducationServiceImpl(educationRepo);
		EducationService educationService18 = new EducationServiceImpl(educationRepo);
		EducationService educationService19 = new EducationServiceImpl(educationRepo);

		try {
			boolean j1 = educationService.validateAndThenSave(educationDTO);
			System.out.println(j1);
			boolean j2 = educationService1.validateAndThenSave(educationDTO1);
			System.out.println(j2);
			boolean j3 = educationService2.validateAndThenSave(educationDTO2);
			System.out.println(j3);
			boolean j4 = educationService3.validateAndThenSave(educationDTO3);
			System.out.println(j4);
			boolean j5 = educationService4.validateAndThenSave(educationDTO4);
			System.out.println(j5);
			boolean j6 = educationService5.validateAndThenSave(educationDTO5);
			System.out.println(j6);
			boolean j7 = educationService6.validateAndThenSave(educationDTO6);
			System.out.println(j7);
			boolean j8 = educationService7.validateAndThenSave(educationDTO7);
			System.out.println(j8);
			boolean j9 = educationService8.validateAndThenSave(educationDTO8);
			System.out.println(j9);
			boolean j10 = educationService9.validateAndThenSave(educationDTO9);
			System.out.println(j10);
			boolean j11 = educationService10.validateAndThenSave(educationDTO10);
			System.out.println(j11);
			boolean j12 = educationService11.validateAndThenSave(educationDTO11);
			System.out.println(j12);
			boolean j13 = educationService12.validateAndThenSave(educationDTO12);
			System.out.println(j13);
			boolean j14 = educationService13.validateAndThenSave(educationDTO13);
			System.out.println(j14);
			boolean j15 = educationService14.validateAndThenSave(educationDTO14);
			System.out.println(j15);
			boolean j16 = educationService15.validateAndThenSave(educationDTO15);
			System.out.println(j16);
			boolean j17 = educationService16.validateAndThenSave(educationDTO16);
			System.out.println(j17);
			boolean j18 = educationService17.validateAndThenSave(educationDTO17);
			System.out.println(j18);
			boolean j19 = educationService18.validateAndThenSave(educationDTO18);
			System.out.println(j19);
			boolean j20 = educationService19.validateAndThenSave(educationDTO19);
			System.out.println(j20);

			EducationDTO find = educationService.find(educationDTO19);
			System.out.println(find);
			EducationDTO find1 = educationService.find(educationDTO18);
			System.out.println(find1);
			EducationDTO find2 = educationService.find(educationDTO15);
			System.out.println(find2);
			EducationDTO find3 = educationService.find(educationDTO3);
			System.out.println(find3);

			EducationDTO findByCandidateName = educationService.findByCandidateName("Jayanth");
			System.out.println(findByCandidateName);
			EducationDTO findByCandidateName2 = educationService.findByCandidateName("Raj");
			System.out.println(findByCandidateName2);
			EducationDTO findByCandidateName3 = educationService.findByCandidateName("Gowda");
			System.out.println(findByCandidateName3);
			EducationDTO findByCandidateName4 = educationService.findByCandidateName("Dinakar");
			System.out.println(findByCandidateName4);

			EducationDTO nameAndUniversity = educationService.findByCandidateNameAndUniversity("Ankith", "VTU");
			System.out.println(nameAndUniversity);
			EducationDTO nameAndUniversity1 = educationService.findByCandidateNameAndUniversity("Gani", "VTU");
			System.out.println(nameAndUniversity1);
			EducationDTO nameAndUniversity2 = educationService.findByCandidateNameAndUniversity("Jainam", "VTU");
			System.out.println(nameAndUniversity2);
			EducationDTO nameAndUniversity3 = educationService.findByCandidateNameAndUniversity("Jaysimha", "VTU");
			System.out.println(nameAndUniversity3);

			int nameDegreeUniversity = educationService.findBacklogByCandidateNameAndDegreeNameAndUniversity("Jayanth",
					"BE", "VTU");
			System.out.println(nameDegreeUniversity);

			EducationDTO nameStartEndDate = educationService.findByCandidateNameAndStartDateAndEndDate("Jayanth",
					LocalDate.of(2017, 8, 13), LocalDate.of(2021, 7, 1));
			System.out.println(nameStartEndDate);

			double per = educationService.findPercentageByCandidateName("Jayanth");
			System.out.println(per);

			String stream = educationService.findStreamByCandidateNameAndDegreeNameAndUniversity("Jayanth", "BE",
					"VTU");
			System.out.println(stream);

			int id = educationService.findIdByCandidateNameAndDegreeNameAndUniversity("Civil", "BE", "Jaysimha");
			System.out.println(id);

			String university = educationService.findUniversityByCandidateName("Darshan");
			System.out.println(university);

		} catch (DataInvalidException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("");
		int total = educationService.total();
		System.out.println(total);

	}
}
