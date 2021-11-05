package com.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vti.entity.Tour;
import com.vti.repositoty.TourRepository;

@Service
public class TourService implements ITourService {

	@Autowired
	private TourRepository repository;

	@Override
	public Page<Tour> getAllTours(Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(pageable);
	}

}
