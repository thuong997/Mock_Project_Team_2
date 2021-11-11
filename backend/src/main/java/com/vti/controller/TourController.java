package com.vti.controller;

import java.io.IOException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vti.entity.Tour;
import com.vti.service.ITourService;

@RestController
@RequestMapping(value = "api/v1/tours")
@CrossOrigin("*")
public class TourController {

	@Autowired
	private ITourService service;

	@GetMapping()
	public ResponseEntity<?> getAllTours(Pageable pageable) {
		Page<Tour> entities = service.getAllTours(pageable);
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> createTour(String nameTour, String timer, LocalDate departureDay,
			int slotBlank,String money,
			MultipartFile img1, MultipartFile img2,
			MultipartFile img3, MultipartFile img4,
			MultipartFile img5, String day1, String day2
			) throws IOException {
		service.createTour(nameTour, timer, departureDay, slotBlank, money, img1, img2, img3, img4, img5, day1, day2);
		return new ResponseEntity<String>("Create successfully!", HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getTourByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<>(service.getTourByID(id), HttpStatus.OK);
	}
}
