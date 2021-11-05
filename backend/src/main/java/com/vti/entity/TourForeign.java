package com.vti.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`TourForeign`")
public class TourForeign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "tourForeignId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short tourForeignId;

	@Column(name = "`nameTour`", length = 500, nullable = false, unique = true)
	private String nameTour;

	@Column(name = "`timer`", nullable = false, length = 500)
	private String timer;

	@Column(name = "`departureDay`", nullable = false)
	private LocalDate departureDay;

	@Column(name = "`slotBlank`", nullable = false)
	private int slotBlank;

	@Column(name = "`money`", nullable = false, length = 50)
	private String money;

	@Column(name = "`img1`", nullable = false, length = 50)
	private String img1;

	@Column(name = "`img2`", nullable = false, length = 50)
	private String img2;

	@Column(name = "`img3`", nullable = false, length = 50)
	private String img3;

	@Column(name = "`img4`", nullable = false, length = 50)
	private String img4;

	@Column(name = "`img5`", nullable = false, length = 50)
	private String img5;

	@Column(name = "`day1`", length = 1000)
	private String day1;

	@Column(name = "`day2`", length = 1000)
	private String day2;

	@Column(name = "`vehicle`", nullable = false)
	private String vehicle = "PLANE";

	public TourForeign() {
		super();
	}

	public TourForeign(short tourForeignId, String nameTour, String timer, LocalDate departureDay, int slotBlank,
			String money, String img1, String img2, String img3, String img4, String img5, String day1, String day2) {
		super();
		this.tourForeignId = tourForeignId;
		this.nameTour = nameTour;
		this.timer = timer;
		this.departureDay = departureDay;
		this.slotBlank = slotBlank;
		this.money = money;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.day1 = day1;
		this.day2 = day2;
	}

	public short getTourForeignId() {
		return tourForeignId;
	}

	public void setTourForeignId(short tourForeignId) {
		this.tourForeignId = tourForeignId;
	}

	public String getNameTour() {
		return nameTour;
	}

	public void setNameTour(String nameTour) {
		this.nameTour = nameTour;
	}

	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}

	public LocalDate getDepartureDay() {
		return departureDay;
	}

	public void setDepartureDay(LocalDate departureDay) {
		this.departureDay = departureDay;
	}

	public int getSlotBlank() {
		return slotBlank;
	}

	public void setSlotBlank(int slotBlank) {
		this.slotBlank = slotBlank;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getImg4() {
		return img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	public String getImg5() {
		return img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	public String getDay1() {
		return day1;
	}

	public void setDay1(String day1) {
		this.day1 = day1;
	}

	public String getDay2() {
		return day2;
	}

	public void setDay2(String day2) {
		this.day2 = day2;
	}
}
