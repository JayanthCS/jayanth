package com.xworkz.snake.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.snake.constant.SnakeType;
import com.xworkz.snake.dto.SnakeDTO;
import com.xworkz.snake.repo.SnakeRepo;
import com.xworkz.snake.repo.SnakeRepoImpl;
import com.xworkz.snake.service.SnakeService;
import com.xworkz.snake.service.SnakeServiceImpl;

public class SnakeDTORunner {

	public static void main(String[] args) {

		Collection<SnakeDTO> snakes = new ArrayList<>();

//		snakes.add(new SnakeDTO(1, "Cobra", SnakeType.VENOMOUS, "Banglore"));
//		snakes.add(new SnakeDTO(2, "Vipers", SnakeType.VENOMOUS, "Westren Ghat"));
//		snakes.add(new SnakeDTO(3, "Krait", SnakeType.VENOMOUS, "Delhi"));
//		snakes.add(new SnakeDTO(4, "Lycodon", SnakeType.NON_VENOMOUS, "Kadur"));

		SnakeDTO snakeDTO = new SnakeDTO(1, "Cobra", SnakeType.VENOMOUS, "Banglore");
		SnakeDTO snakeDTO1 = new SnakeDTO(2, "Vipers", SnakeType.VENOMOUS, "Westren Ghat");
		SnakeDTO snakeDTO2 = new SnakeDTO(3, "Krait", SnakeType.VENOMOUS, "Delhi");
		SnakeDTO snakeDTO3 = new SnakeDTO(4, "Lycodon", SnakeType.NON_VENOMOUS, "Kadur");

		SnakeRepo snakeRepo = new SnakeRepoImpl();
		SnakeService snakeService = new SnakeServiceImpl(snakeRepo);

		boolean save = snakeService.validateAndThenSave(snakeDTO);
		System.out.println(save);
		boolean save1 = snakeService.validateAndThenSave(snakeDTO1);
		System.out.println(save1);
		boolean save2 = snakeService.validateAndThenSave(snakeDTO2);
		System.out.println(save2);
		boolean save3 = snakeService.validateAndThenSave(snakeDTO3);
		System.out.println(save3);

		Optional<SnakeDTO> optinalById = snakeService.findById(3);

		if (optinalById.isPresent()) {
			System.out.println("Snake exist");
			SnakeDTO optinal = optinalById.get();
			System.out.println(optinal);
		} else {
			System.out.println("Snake does not exist");
		}
	}
}
