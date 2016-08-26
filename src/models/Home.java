package models;

import java.sql.Date;

public class Home {
	private int homeId;
	private String homeTitle;
	private String homeLocation;
	private int noOfBeds;
	private int noOfBaths;
	private double sizeInSqFeet;
	private double pricePerSqFeet;
	private String floor;
	private String homeDescription;
	private String category;
	private Date date;
	private String username;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHomeId() {
		return homeId;
	}
	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}
	public String getHomeTitle() {
		return homeTitle;
	}
	public void setHomeTitle(String homeTitle) {
		this.homeTitle = homeTitle;
	}
	public String getHomeLocation() {
		return homeLocation;
	}
	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}
	public int getNoOfBeds() {
		return noOfBeds;
	}
	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}
	public int getNoOfBaths() {
		return noOfBaths;
	}
	public void setNoOfBaths(int noOfBaths) {
		this.noOfBaths = noOfBaths;
	}
	public double getSizeInSqFeet() {
		return sizeInSqFeet;
	}
	public void setSizeInSqFeet(double sizeInSqFeet) {
		this.sizeInSqFeet = sizeInSqFeet;
	}
	public double getPricePerSqFeet() {
		return pricePerSqFeet;
	}
	public void setPricePerSqFeet(double pricePerSqFeet) {
		this.pricePerSqFeet = pricePerSqFeet;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getHomeDescription() {
		return homeDescription;
	}
	public void setHomeDescription(String homeDescription) {
		this.homeDescription = homeDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
	
	
}
