package models;

import java.sql.Date;

public class Land {
	private int landId;
	private String landTitle;
	private String landLocation;
	private double totalKatha;
	private double pricePerKatha;
	private String landDescription;
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
	public int getLandId() {
		return landId;
	}
	public void setLandId(int landId) {
		this.landId = landId;
	}
	public String getLandTitle() {
		return landTitle;
	}
	public void setLandTitle(String landTitle) {
		this.landTitle = landTitle;
	}
	public String getLandLocation() {
		return landLocation;
	}
	public void setLandLocation(String landLocation) {
		this.landLocation = landLocation;
	}
	public double getTotalKatha() {
		return totalKatha;
	}
	public void setTotalKatha(double totalKatha) {
		this.totalKatha = totalKatha;
	}
	public double getPricePerKatha() {
		return pricePerKatha;
	}
	public void setPricePerKatha(double pricePerKatha) {
		this.pricePerKatha = pricePerKatha;
	}
	public String getLandDescription() {
		return landDescription;
	}
	public void setLandDescription(String landDescription) {
		this.landDescription = landDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
