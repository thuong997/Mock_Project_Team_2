package com.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vti.entity.TourForeign;
import com.vti.repositoty.TourForeignRepository;

@Service
public class TourForeignService implements ITourForeignService {

	@Autowired
	private TourForeignRepository repository;

	@Override
	public Page<TourForeign> getAllToursForeign(Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(pageable);
	}
	
}
