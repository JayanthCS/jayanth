package com.xworkz.showroom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SocksDTO;

@Component
public class SocksRepoImpl implements SocksRepo {

	private Collection<SocksDTO> socksDTOs = new ArrayList<>();

	public SocksRepoImpl(Collection<SocksDTO> socksDTOs) {
		this.socksDTOs = socksDTOs;
	}

	@Override
	public boolean save(SocksDTO dto) {

		return this.socksDTOs.add(dto);
	}

}
