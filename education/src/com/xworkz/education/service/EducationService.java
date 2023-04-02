package com.xworkz.education.service;

import java.time.LocalDate;

import com.xworkz.education.dto.EducationDTO;
import com.xworkz.education.exception.DataInvalidException;

public interface EducationService {

	boolean validateAndThenSave(EducationDTO dto) throws DataInvalidException;

	EducationDTO find(EducationDTO dto) throws DataInvalidException;

	EducationDTO findByCandidateName(String name) throws DataInvalidException;

	EducationDTO findByCandidateNameAndUniversity(String name, String university) throws DataInvalidException;

	int findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws DataInvalidException;

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) throws DataInvalidException;

	double findPercentageByCandidateName(String candidateName) throws DataInvalidException;

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws DataInvalidException;

	int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName, String university) throws DataInvalidException;

	String findUniversityByCandidateName(String candidateName)throws DataInvalidException;

	int total();

}
