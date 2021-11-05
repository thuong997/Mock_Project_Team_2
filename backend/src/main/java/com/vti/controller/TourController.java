package com.vti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.vti.dto.GroupFormForCreating;
import com.vti.entity.Tour;
import com.vti.service.ITourService;

@RestController
@RequestMapping(value = "api/v1/tours")
@CrossOrigin("*")
public class TourController {

	@Autowired
	private ITourService service;
	
	@GetMapping()
	public ResponseEntity<?> getAllTours(
			Pageable pageable) {
		Page<Tour> entities = service.getAllTours(pageable);
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}
	
//	@PostMapping()
//	public ResponseEntity<?> createTour(@RequestBody TourFormForCreating form) {
//		service.createTour(form);
//		return new ResponseEntity<String>("Create successfully!", HttpStatus.OK);
//	} 

}
