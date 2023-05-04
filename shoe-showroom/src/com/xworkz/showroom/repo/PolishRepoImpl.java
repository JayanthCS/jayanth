package com.xworkz.showroom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.PolishDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class PolishRepoImpl implements PolishRepo {

	private Collection<PolishDTO> collection = new ArrayList<>();

	public PolishRepoImpl(Collection<PolishDTO> collection) {
		this.collection = collection;
	}

	@Override
	public boolean save(PolishDTO dto) {

		return this.collection.add(dto);
	}

}
