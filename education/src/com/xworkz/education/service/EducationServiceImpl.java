package com.xworkz.education.service;

import java.time.LocalDate;

import com.xworkz.education.dto.EducationDTO;
import com.xworkz.education.exception.DataInvalidException;
import com.xworkz.education.exception.MemoryFullException;
import com.xworkz.education.repo.EducationRepo;
import static com.xworkz.education.util.EducationUtil.*;

public class EducationServiceImpl implements EducationService {

	private EducationRepo repo;

	public EducationServiceImpl(EducationRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndThenSave(EducationDTO dto) throws DataInvalidException {

		if (dto != null) {
			System.out.println("dto is not null");

			boolean validDegreeName = false;
			boolean validPercentage = false;
			boolean validUniversity = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validBacklog = false;
			boolean validStream = false;
			boolean validCandidateName = false;

			String degreeName = dto.getDegreeName();
			if (validString(degreeName)) {
				System.out.println("valid degreeName");
				validDegreeName = true;
			} else {
				System.err.println("invalid degreeName");
			}

			int percentage = dto.getPercentage();
			if (validInt(percentage)) {
				System.out.println("valid percentage");
				validPercentage = true;
			} else {
				System.err.println("invalid percentage");
			}

			String university = dto.getUniversity();
			if (validString(university)) {
				System.out.println("valid university");
				validUniversity = true;
			} else {
				System.err.println("invalid university");
			}

			LocalDate startDate = dto.getStartDate();
			if (validStartDate(startDate)) {
				System.out.println("valid startDate");
				validStartDate = true;
			} else {
				System.err.println("invalid startDate");
			}

			LocalDate endDate = dto.getEndDate();
			if (validEndDate(endDate)) {
				System.out.println("valid endDate");
				validEndDate = true;

			} else {
				System.err.println("invalid endDate");
			}

			int backlog = dto.getBacklogs();
			if (validInt(backlog)) {
				System.out.println("valid backlog");
				validBacklog = true;
			} else {
				System.err.println("invalid backlog");
			}

			String stream = dto.getStream();
			if (validString(stream)) {
				System.out.println("valid stream");
				validStream = true;
			} else {
				System.err.println("invalid stream");
			}

			String candidateName = dto.getCandidateName();
			if (validString(candidateName)) {
				System.out.println("valid candidateName");
				validCandidateName = true;
			} else {
				System.err.println("invalid candidateName");
			}

			if (validFlags(validDegreeName, validPercentage, validUniversity, validEndDate, validStartDate,
					validBacklog, validStream, validCandidateName)) {
				System.out.println("data is valid we can save");
				try {
					boolean save = this.repo.save(dto);
				} catch (MemoryFullException e) {

					e.printStackTrace();
				}
				return true;

			} else {
				System.err.println("data is not valid we cannot save");
			}

		} else {
			System.err.println("dto is null");
		}
		throw new DataInvalidException("Fill proper data");

	}

	@Override
	public EducationDTO find(EducationDTO dto) throws DataInvalidException {
		if (dto != null) {
			return this.repo.find(dto);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public EducationDTO findByCandidateName(String name) throws DataInvalidException {
		if (validString(name)) {
			return this.repo.findByCandidateName(name);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String name, String university) throws DataInvalidException {
		if (validString(university) && validString(name)) {
			return this.repo.findByCandidateNameAndUniversity(name, university);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public int findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws DataInvalidException {
		if (validString(candidateName) && validString(degreeName) && validString(university)) {
			return this.repo.findBacklogByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
					university);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) throws DataInvalidException {
		if (validString(candidateName) && validStartDate(startDate) && validEndDate(endDate)) {
			return this.repo.findByCandidateNameAndStartDateAndEndDate(candidateName, startDate, endDate);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public double findPercentageByCandidateName(String candidateName) throws DataInvalidException {
		if (validString(candidateName)) {
			return this.repo.findPercentageByCandidateName(candidateName);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws DataInvalidException {
		if (validString(candidateName) && validString(degreeName) && validString(university)) {
			return this.repo.findStreamByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName, university);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public int findIdByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) throws DataInvalidException {
		if (validString(candidateName) && validString(degreeName) && validString(university)) {
			return this.repo.findIdByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName, university);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public String findUniversityByCandidateName(String candidateName) throws DataInvalidException {
		if (validString(candidateName)) {
			return this.repo.findUniversityByCandidateName(candidateName);
		}
		throw new DataInvalidException("Fill proper data");
	}

	@Override
	public int total() {

		return this.repo.total();
	}

}
