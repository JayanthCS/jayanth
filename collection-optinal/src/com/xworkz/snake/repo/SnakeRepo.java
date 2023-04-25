package com.xworkz.snake.repo;

import java.util.Optional;

import com.xworkz.snake.dto.SnakeDTO;

public interface SnakeRepo {

	boolean save(SnakeDTO dto);
	
	Optional<SnakeDTO> findById(int id);
}
