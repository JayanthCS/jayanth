package com.xworkz.snake.service;

import java.util.Optional;

import com.xworkz.snake.dto.SnakeDTO;

public interface SnakeService {

	boolean validateAndThenSave(SnakeDTO dto);
	
	Optional<SnakeDTO> findById(int id);
}
