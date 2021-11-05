package com.vti.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.vti.entity.TourForeign;


public interface ITourForeignService {

	Page<TourForeign> getAllToursForeign(Pageable pageable);
	
}
