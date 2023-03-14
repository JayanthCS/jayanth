package com.xworkz.project.boot;

import java.time.LocalDate;

import com.xworkz.project.constant.Language;
import com.xworkz.project.constant.Supported;
import com.xworkz.project.constant.Type;
import com.xworkz.project.dto.ApplicationDTO;
import com.xworkz.project.service.ApplicationService;
import com.xworkz.project.service.ApplicationServiceImplements;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationDTO apl = new ApplicationDTO();

		apl.setName("Instagram");
		apl.setDevelopedBy("");
		apl.setCreatedDate(LocalDate.of(2015, 8, 13));
		apl.setSize(225);
		apl.setVersion(2.24D);
		apl.setType(Type.ANDROID);
		apl.setPrice(80);
		apl.setFirstVersionReleaseDate(LocalDate.of(2000, 1, 1));
		apl.setCurrentVersionReleaseDate(LocalDate.of(2023, 2, 1));
		apl.setNextVersionReleaseDate(LocalDate.of(2024, 1, 1));
		apl.setTrialDays(50);
		apl.setLangUsed(Language.ENGLISH);
		apl.setMinProcessorSpeed(150);
		apl.setMinRamSpaceRequired(200);
		apl.setInternetNeeded(true);
		apl.setAgeLimit(18);
		apl.setNoOfDownloads(5);
		apl.setRating(0);
		apl.setOsTypeSupported(Supported.ANDROID);
		apl.toString();
		System.out.println(apl);

		ApplicationService applicationService = new ApplicationServiceImplements();
		boolean saved = applicationService.validateAndThenSave(apl);
		System.out.println("saved " + saved);

	}
}
