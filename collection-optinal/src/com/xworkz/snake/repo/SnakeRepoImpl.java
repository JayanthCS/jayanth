package com.xworkz.snake.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.snake.dto.SnakeDTO;

public class SnakeRepoImpl implements SnakeRepo {

	private Collection<SnakeDTO> snakeDTOs=new ArrayList<>();

	public SnakeRepoImpl() {
		// TODO Auto-generated constructor stub
	}

	public SnakeRepoImpl(Collection<SnakeDTO> snakeDTOs) {
		this.snakeDTOs = snakeDTOs;
	}

	@Override
	public boolean save(SnakeDTO dto) {

		return this.snakeDTOs.add(dto);
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		for (SnakeDTO snakeDTO : snakeDTOs) {
			if (snakeDTO.getId() == id) {
				return Optional.of(snakeDTO);
			}
		}
		return Optional.empty();
	}

}
