package com.xworkz.education.repo;

import java.time.LocalDate;

import com.xworkz.education.dto.EducationDTO;
import com.xworkz.education.exception.MemoryFullException;

public interface EducationRepo {

	public boolean save(EducationDTO repo) throws MemoryFullException;

	default boolean isExist(EducationDTO dto) {
		return false;
	}

	EducationDTO find(EducationDTO dto);

	EducationDTO findByCandidateName(String name);

	EducationDTO findByCandidateNameAndUniversity(String name, String university);

	int findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate);

	double findPercentageByCandidateName(String candidateName);

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String university);

	String findUniversityByCandidateName(String candidateName);

	int total();
}
