package com.vti.service;

import java.io.IOException;
import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.vti.entity.Tour;

public interface ITourService {

	Page<Tour> getAllTours(Pageable pageable);

//	void createTour(Tour tour);

	Tour getTourByID(short id);

	void createTour(String nameTour, String timer, LocalDate departureDay,
			int slotBlank,String money,
			MultipartFile img1, MultipartFile img2,
			MultipartFile img3, MultipartFile img4,
			MultipartFile img5, String day1, String day2) throws IOException;


}
