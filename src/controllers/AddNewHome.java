package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adapters.HomeAdapter;
import models.Home;

/**
 * Servlet implementation class AddNewHome
 */
@WebServlet({ "/AddNewHome", "/addnewhome" })
public class AddNewHome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	models.Home home = new models.Home();
	home.setHomeId(12);
	home.setHomeTitle("sas");
	home.setSizeInSqFeet(1.2222);
	home.setFloor("floor");
	home.setPricePerSqFeet(12.222);
	home.setCategory("category");
	home.setHomeDescription("homeDescription");
	
	home.setUsername("username");
	home.setNoOfBeds(12);
	home.setNoOfBaths(14);
	home.setCity("city");
	home.setArea("area");
	home.setAddress("address");
	home.setOffertype("offertype");
	
	HomeAdapter ha = new HomeAdapter();
	ha.insert(home);
		
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
