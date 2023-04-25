package com.xworkz.snake.service;

import java.util.Optional;

import com.xworkz.snake.dto.SnakeDTO;
import com.xworkz.snake.repo.SnakeRepo;

public class SnakeServiceImpl implements SnakeService {

	private SnakeRepo snakeRepo;

	public SnakeServiceImpl(SnakeRepo snakeRepo) {
		this.snakeRepo = snakeRepo;
	}

	@Override
	public boolean validateAndThenSave(SnakeDTO dto) {
		if (dto != null) {
			return this.snakeRepo.save(dto);
		}

		return false;
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {

		return this.snakeRepo.findById(id);
	}

}
