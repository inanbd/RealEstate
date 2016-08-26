package adapters;

import java.sql.ResultSet;
import java.util.ArrayList;

import models.Office;


public class OfficeAdapter {
	public void insert(Office office)
	{
		String sql = "INSERT INTO offices VALUES (null,'"+office.getOfficeTitle()+"','"+office.getOfficeLocation()+"','"+office.getSizeInSqFeet()+"','"+office.getFloor()+"','"+office.getPrice()+"','"+office.getCategory()+"','"+office.getOfficeDescription()+"','"+office.getDate()+"','"+office.getUsername()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public void update(Office office)
	{
		String sql = "UPDATE offices SET officeTitle = '"+office.getOfficeTitle()+"', officeLocation = '"+office.getOfficeLocation()+"', sizeInSqFeet = '"+office.getSizeInSqFeet()+"', floor = '"+office.getFloor()+"', price = '"+office.getPrice()+"', category = '"+office.getCategory()+"', username = '"+office.getUsername()+"', officeDescription = '"+office.getOfficeDescription()+"', date = '"+office.getDate()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(int id)
	{
		String sql = "DELETE FROM offices WHERE id="+id;
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(Office office)
	{
		String sql = "DELETE FROM Users WHERE id="+office.getOfficeId();
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public ArrayList<Office> getAll()
	{
		String sql = "SELECT * FROM Users";
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		ArrayList<Office> officelist = new ArrayList<Office>();
		try {
			while(rs.next())
			{
				Office office = new Office();
				office.setOfficeId(rs.getInt("officeId"));
				office.setOfficeTitle(rs.getString("officeTitle"));
				office.setOfficeLocation(rs.getString("officeLocation"));
				office.setSizeInSqFeet(rs.getDouble("sizeInSqFeet"));
				office.setFloor(rs.getString("floor"));
				office.setPrice(rs.getDouble("price"));
				office.setOfficeDescription(rs.getString("officeDescription"));
				office.setCategory(rs.getString("category"));
				office.setDate(rs.getDate("date"));
				office.setUsername(rs.getString("username"));
				
				
				officelist.add(office);
			}
			return officelist;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Office get(int id)
	{
		String sql = "SELECT * FROM Users WHERE id="+id;
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		Office office = new Office();
		try {
			if(rs.next())
			{
				office.setOfficeId(rs.getInt("officeId"));
				office.setOfficeTitle(rs.getString("officeTitle"));
				office.setOfficeLocation(rs.getString("officeLocation"));
				office.setCategory(rs.getString("category"));
				office.setFloor(rs.getString("floor"));
				office.setPrice(rs.getDouble("price"));
				office.setOfficeDescription(rs.getString("officeDescription"));
				office.setCategory(rs.getString("category"));
				office.setDate(rs.getDate("date"));
				office.setUsername(rs.getString("username"));
				
				
				return office;
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
