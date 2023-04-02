package com.xworkz.education.repo;

import java.time.LocalDate;

import com.xworkz.education.dto.EducationDTO;

public class EducationRepoImpl implements EducationRepo {

	private EducationDTO[] educationDTO = new EducationDTO[20];
	int index = 0;

	public EducationRepoImpl() {
		System.out.println("no-arg constructor in EducationRepoImpl");
	}

	@Override
	public boolean save(EducationDTO repo) {
		if (this.index < this.educationDTO.length) {
			educationDTO[index] = repo;
			this.index++;
			System.out.println("Saving is correct");
			return true;
		} else {
			System.err.println("we cannot save");

		}
		return false;
	}

	@Override
	public boolean isExist(EducationDTO dto) {

		if (index == 0) {
			System.out.println("first element is not exists, we cannot check");
			return false;

		} else {
			System.out.println("First element is exists we can check");
			for (int index = 0; index < educationDTO.length; index++) {
				EducationDTO ref = this.educationDTO[index];
				if (ref.equals(dto)) {
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
	public EducationDTO find(EducationDTO dto) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}

		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(name)) {
				System.out.println("dto is found name");
				return ref;
			}
		}
		return null;

	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String name, String university) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(name) && ref.getUniversity().equals(university)) {
				System.out.println("dto is found for name and university");
				return ref;
			}
		}
		return null;
	}

	@Override
	public int findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(candidateName) && ref.getDegreeName().equals(degreeName)) {
				System.out.println("dto is found for candidateName and degreeName");
				int backlogs = ref.getBacklogs();
				return backlogs;
			}
		}

		return 0;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(candidateName) && ref.getStartDate().equals(startDate)
					&& ref.getEndDate().equals(endDate)) {
				System.out.println("dto is found for candidateName and startDate and endDate");
				return ref;
			}
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(candidateName)) {
				System.out.println("dto is found for candidateName");
				return ref.getPercentage();
			}
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(candidateName) && ref.getDegreeName().equals(degreeName)
					&& ref.getUniversity().equals(university)) {
				System.out.println("dto is found for candidateName and degreeName and university");
				return ref.getStream();
			}
		}
		return null;
	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(candidateName) && ref.getDegreeName().equals(degreeName)
					&& ref.getUniversity().equals(university)) {
				System.out.println("dto is found for candidateName and degreeName and university");
				return ref.getId();
			}
		}
		return 0;
	}

	@Override
	public String findUniversityByCandidateName(String candidateName) {
		for (int index = 0; index < educationDTO.length; index++) {
			EducationDTO ref = this.educationDTO[index];
			if (ref.getCandidateName().equals(candidateName)) {
				System.out.println("dto is found for candidateName");
				return ref.getUniversity();
			}
		}
		return null;
	}

	@Override
	public int total() {
		
		return this.index;
	}

}
