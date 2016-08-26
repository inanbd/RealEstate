package models;

import java.sql.Date;

public class Office {
	private int officeId;
	private String officeTitle;
	private String officeLocation;
	private double sizeInSqFeet;
	private String floor;
	private double price;
	private String category;
	private String officeDescription;
	private Date date;
	private String username;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public int getOfficeId() {
		return officeId;
	}
	public String getOfficeTitle() {
		return officeTitle;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public double getSizeInSqFeet() {
		return sizeInSqFeet;
	}
	public String getFloor() {
		return floor;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	public String getOfficeDescription() {
		return officeDescription;
	}
	public Date getDate() {
		return date;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public void setOfficeTitle(String officeTitle) {
		this.officeTitle = officeTitle;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public void setSizeInSqFeet(double sizeInSqFeet) {
		this.sizeInSqFeet = sizeInSqFeet;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setOfficeDescription(String officeDescription) {
		this.officeDescription = officeDescription;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

	
}
