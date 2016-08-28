package adapters;

import java.sql.ResultSet;
import java.util.ArrayList;


import models.Home;

public class HomeAdapter {

	public void insert(Home home)
	{
		String sql = "INSERT INTO home VALUES (null,'"+home.getHomeTitle()+"','"+home.getNoOfBeds()+"','"+home.getNoOfBaths()+"','"+home.getSizeInSqFeet()+"','"+home.getPricePerSqFeet()+"','"+home.getFloor()+"','"+home.getHomeDescription()+"','"+home.getCategory()+"','"+home.getUsername()+"','"+home.getCity()+"','"+home.getArea()+"','"+home.getAddress()+"','"+home.getOffertype()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public void update(Home home)
	{
		String sql = "UPDATE home SET homeTitle = '"+home.getHomeTitle()+"', sizeInSqFeet = '"+home.getSizeInSqFeet()+"', floor = '"+home.getFloor()+"', price = '"+home.getPricePerSqFeet()+"', category = '"+home.getCategory()+"', username = '"+home.getUsername()+"', homeDescription = '"+home.getHomeDescription()+"',  city = '"+home.getCity()+"', area = '"+home.getArea()+"', address = '"+home.getAddress()+"', offertype = '"+home.getOffertype()+" ,noofbeds= "+home.getNoOfBeds()+",noofbaths= "+home.getNoOfBaths()+"WHERE homeId ='"+home.getHomeId()+"'";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(int id)
	{
		String sql = "DELETE FROM home WHERE homeId="+id;
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(Home home)
	{
		String sql = "DELETE FROM home WHERE homeId="+home.getHomeId();
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public ArrayList<Home> getAll()
	{
		String sql = "SELECT * FROM home";
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		ArrayList<Home> homelist = new ArrayList<Home>();
		try {
			while(rs.next())
			{
				Home home = new Home();
				home.setHomeId(rs.getInt("homeId"));
				home.setHomeTitle(rs.getString("homeTitle"));
				home.setSizeInSqFeet(rs.getDouble("sizeinsqfeet"));
				home.setFloor(rs.getString("floor"));
				home.setPricePerSqFeet(rs.getDouble("price"));
				home.setCategory(rs.getString("category"));
				home.setHomeDescription(rs.getString("homeDescription"));
				
				home.setUsername(rs.getString("username"));
				home.setNoOfBeds(rs.getInt("noofbeds"));
				home.setNoOfBaths(rs.getInt("noofbaths"));
				home.setCity(rs.getString("city"));
				home.setArea(rs.getString("area"));
				home.setAddress(rs.getString("address"));
				home.setOffertype(rs.getString("offertype"));				
				homelist.add(home);
			}
			return homelist;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Home get(int id)
	{
		String sql = "SELECT * FROM home WHERE id="+id;
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		Home home = new Home();
		try {
			if(rs.next())
			{
				home.setHomeId(rs.getInt("homeId"));
				home.setHomeTitle(rs.getString("homeTitle"));
				home.setSizeInSqFeet(rs.getDouble("sizeinsqfeet"));
				home.setFloor(rs.getString("floor"));
				home.setPricePerSqFeet(rs.getDouble("price"));
				home.setCategory(rs.getString("category"));
				home.setHomeDescription(rs.getString("homeDescription"));
				//home.setDate(rs.getDate("dateposted"));
				home.setUsername(rs.getString("username"));
				home.setNoOfBeds(rs.getInt("noofbeds"));
				home.setNoOfBaths(rs.getInt("noofbaths"));
				home.setCity(rs.getString("city"));
				home.setArea(rs.getString("area"));
				home.setAddress(rs.getString("address"));
				home.setOffertype(rs.getString("offertype"));	
				
				return home;
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
