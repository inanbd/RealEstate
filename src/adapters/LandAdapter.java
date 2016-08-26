package adapters;

import java.sql.ResultSet;
import java.util.ArrayList;

import models.Land;

public class LandAdapter {
	
	public void insert(Land land)
	{
		String sql = "INSERT INTO Lands VALUES (null,'"+land.getLandTitle()+"','"+land.getLandLocation()+"','"+land.getTotalKatha()+"','"+land.getPricePerKatha()+"','"+land.getLandDescription()+"','"+land.getCategory()+"','"+land.getDate()+"','"+land.getUsername()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public void update(Land land)
	{
		String sql = "UPDATE Lands SET landTitle = '"+land.getLandTitle()+"', landLocation = '"+land.getLandLocation()+"', totalKatha = '"+land.getTotalKatha()+"', pricePerKatha = '"+land.getPricePerKatha()+"', landDescription = '"+land.getLandDescription()+"', category = '"+land.getCategory()+"', username = '"+land.getUsername()+"', date = '"+land.getDate()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(int id)
	{
		String sql = "DELETE FROM Lands WHERE id="+id;
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(Land land)
	{
		String sql = "DELETE FROM Users WHERE id="+land.getLandId();
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public ArrayList<Land> getAll()
	{
		String sql = "SELECT * FROM Users";
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		ArrayList<Land> landlist = new ArrayList<Land>();
		try {
			while(rs.next())
			{
				Land land = new Land();
				land.setLandId(rs.getInt("landId"));
				land.setLandTitle(rs.getString("landTitle"));
				land.setLandLocation(rs.getString("landLocation"));
				land.setTotalKatha(rs.getDouble("totalKatha"));
				land.setPricePerKatha(rs.getDouble("pricePerKatha"));
				land.setLandDescription(rs.getString("landDescription"));
				land.setCategory(rs.getString("category"));
				land.setDate(rs.getDate("date"));
				land.setUsername(rs.getString("username"));
				
				landlist.add(land);
			}
			return landlist;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Land get(int id)
	{
		String sql = "SELECT * FROM Users WHERE id="+id;
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		Land land = new Land();
		try {
			if(rs.next())
			{
				land.setLandId(rs.getInt("landId"));
				land.setLandTitle(rs.getString("landTitle"));
				land.setLandLocation(rs.getString("landLocation"));
				land.setTotalKatha(rs.getDouble("totalKatha"));
				land.setPricePerKatha(rs.getDouble("pricePerKatha"));
				land.setLandDescription(rs.getString("landDescription"));
				land.setCategory(rs.getString("category"));
				land.setDate(rs.getDate("date"));
				land.setUsername(rs.getString("username"));
				
				
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
