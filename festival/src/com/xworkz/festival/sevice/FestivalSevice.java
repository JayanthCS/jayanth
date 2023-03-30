package com.xworkz.festival.sevice;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.InvalidFestivalException;

public interface FestivalSevice {

	boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException;
}
