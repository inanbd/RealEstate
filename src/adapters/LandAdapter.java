package adapters;

import java.sql.ResultSet;
import java.util.ArrayList;

import models.Land;

public class LandAdapter {
	
	public void insert(Land land)
	{
		String sql = "INSERT INTO land VALUES (null,'"+land.getLandTitle()+"','"+land.getTotalKatha()+"','"+land.getPricePerKatha()+"','"+land.getLandDescription()+"','"+land.getCategory()+"','"+land.getUsername()+"','"+land.getCity()+"','"+land.getArea()+"','"+land.getAddress()+"','"+land.getOffertype()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public void update(Land land)
	{
		String sql = "UPDATE land SET landTitle = '"+land.getLandTitle()+"', totalKatha = '"+land.getTotalKatha()+"', pricePerKatha = '"+land.getPricePerKatha()+"', landDescription = '"+land.getLandDescription()+"', category = '"+land.getCategory()+"', username = '"+land.getUsername()+"', city = '"+land.getCity()+"', area = '"+land.getArea()+"', address = '"+land.getAddress()+"', offertype = '"+land.getOffertype()+"' WHERE  landId = '"+land.getLandId()+"'";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(int id)
	{
		String sql = "DELETE FROM land WHERE landId="+id;
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(Land land)
	{
		String sql = "DELETE FROM land WHERE landId="+land.getLandId();
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public ArrayList<Land> getAll()
	{
		String sql = "SELECT * FROM land";
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		ArrayList<Land> landlist = new ArrayList<Land>();
		try {
			while(rs.next())
			{
				Land land = new Land();
				land.setLandId(rs.getInt("landId"));
				land.setLandTitle(rs.getString("landTitle"));
				
				land.setTotalKatha(rs.getDouble("totalkatha"));
				land.setPricePerKatha(rs.getDouble("pricePerKatha"));
				land.setLandDescription(rs.getString("landDescription"));
				land.setCategory(rs.getString("category"));
				//land.setDate(rs.getDate("dateposted"));
				land.setUsername(rs.getString("username"));
				
				land.setCity(rs.getString("city"));
				land.setCity(rs.getString("area"));
				land.setCity(rs.getString("address"));
				land.setCity(rs.getString("offertype"));

				landlist.add(land);
			}
			return landlist;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Land getSingle(int id)
	{
		String sql = "SELECT * FROM land WHERE id="+id;
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		Land land = new Land();
		try {
			if(rs.next())
			{
				land.setLandId(rs.getInt("landId"));
				land.setLandTitle(rs.getString("landTitle"));
				land.setTotalKatha(rs.getDouble("totalkatha"));
				land.setPricePerKatha(rs.getDouble("pricePerKatha"));
				land.setLandDescription(rs.getString("landDescription"));
				land.setCategory(rs.getString("category"));
				//land.setDate(rs.getDate("dateposted"));
				land.setUsername(rs.getString("username"));
				
				land.setCity(rs.getString("city"));
				land.setCity(rs.getString("area"));
				land.setCity(rs.getString("address"));
				land.setCity(rs.getString("offertype"));
				
				
				return land;
			}
			else
			{
				return null;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
