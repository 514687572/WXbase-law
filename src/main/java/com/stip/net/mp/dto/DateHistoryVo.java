package com.stip.net.mp.dto;

import java.util.List;

public class DateHistoryVo {
	private List<String> images;
	private String title;
	private String hisDate;
	private String hisId;
	private String year;
	private String month;
	private String day;
	
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHisDate() {
		return hisDate;
	}
	public void setHisDate(String hisDate) {
		this.hisDate = hisDate;
	}
	public String getHisId() {
		return hisId;
	}
	public void setHisId(String hisId) {
		this.hisId = hisId;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}
