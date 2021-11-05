package com.vti.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.vti.entity.Tour;


public interface ITourService {

	Page<Tour> getAllTours(Pageable pageable);
	
}
