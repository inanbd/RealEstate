package models;

public class Area {
	public int areaId;
	public String areaTitle;
	public int cityid;
	
	
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public int getAreaId() {
		return areaId;
	}
	public String getAreaTitle() {
		return areaTitle;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public void setAreaTitle(String areaTitle) {
		this.areaTitle = areaTitle;
	}
	
}
