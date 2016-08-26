package adapters;

import java.sql.ResultSet;
import java.util.ArrayList;

import models.User;

public class UserAdapter {

	public void insert(User usr)
	{
		String sql = "INSERT INTO Users VALUES (null,'"+usr.getUsername()+"','"+usr.getPassword()+"','2','"+usr.getFirstname()+"','"+usr.getLastname()+"','"+usr.getAddress()+"','"+usr.getEmail()+"','"+usr.getContactnumber()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public void update(User usr)
	{
		String sql = "UPDATE Users SET username = '"+usr.getUsername()+"', password = '"+usr.getPassword()+"', firstname = '"+usr.getFirstname()+"', lastname = '"+usr.getLastname()+"', address = '"+usr.getAddress()+"', email = '"+usr.getEmail()+"', contactnumber '"+usr.getContactnumber()+"')";
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(int id)
	{
		String sql = "DELETE FROM Users WHERE id="+id;
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	public void delete(User usr)
	{
		String sql = "DELETE FROM Users WHERE id="+usr.getId();
		DataAccess da = new DataAccess();
		da.executeQuery(sql);
	}
	
	public ArrayList<User> getAll()
	{
		String sql = "SELECT * FROM Users";
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		ArrayList<User> usrlist = new ArrayList<User>();
		try {
			while(rs.next())
			{
				User usr = new User();
				usr.setId(rs.getInt("id"));
				usr.setFirstname(rs.getString("firstname"));
				usr.setLastname(rs.getString("lastname"));
				usr.setEmail(rs.getString("email"));
				usr.setType(rs.getInt("type"));
				usr.setAddress(rs.getString("address"));
				usr.setPassword(rs.getString("password"));
				usr.setUsername(rs.getString("username"));
				usr.setContactnumber(rs.getString("contactnumber"));
				
				usrlist.add(usr);
			}
			return usrlist;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public User get(int id)
	{
		String sql = "SELECT * FROM Users WHERE id="+id;
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		User usr = new User();
		try {
			if(rs.next())
			{
				usr.setId(rs.getInt("id"));
				usr.setFirstname(rs.getString("firstname"));
				usr.setLastname(rs.getString("lastname"));
				usr.setEmail(rs.getString("email"));
				usr.setType(rs.getInt("type"));
				usr.setAddress(rs.getString("address"));
				usr.setPassword(rs.getString("password"));
				usr.setUsername(rs.getString("username"));
				usr.setContactnumber(rs.getString("contactnumber"));
				return usr;
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
	
	public models.User login(models.User user){
		
		String sql = "Select * from Users where username = '"+user.getUsername()+"' And password = '"+user.getPassword()+"'";
		
		DataAccess da = new DataAccess();
		ResultSet rs = da.getResultSet(sql);
		try {
			if(rs.next())
			{
				user.setId(rs.getInt("id"));
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
				user.setType(rs.getInt("type"));
				user.setAddress(rs.getString("address"));
				user.setContactnumber(rs.getString("contactnumber"));
				
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	
	
	
}
