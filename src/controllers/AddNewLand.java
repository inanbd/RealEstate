package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Sessions.SessionJobs;
import adapters.AreaAdapter;
import adapters.CityAdapter;
import adapters.LandAdapter;
import adapters.OfferAdapter;
import models.Land;
import models.Office;

@WebServlet({ "/AddNewLand", "/addnewland" })
public class AddNewLand extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Office office  = new Office();

		CityAdapter ca = new CityAdapter();
		AreaAdapter aa = new AreaAdapter();
		OfferAdapter oa = new OfferAdapter();
		
		request.setAttribute("citylist",ca.getAll() );
		request.setAttribute("arealist",aa.getAll() );
		request.setAttribute("offerlist",oa.getAll() );
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/view_addNewLand.jsp");
		disp.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String title = request.getParameter("title");
		String size = request.getParameter("katha");
		String price = request.getParameter("price");
		String category = "";//request.getParameter("category");
		String description = request.getParameter("description");
		String city = request.getParameter("city");
		String area = request.getParameter("area");
		String offer = request.getParameter("offer");
		String address = request.getParameter("address");
		String username = new SessionJobs().getUsername(request);
		
		
		
		Land land = new Land();
		
		land.setAddress(address);
		land.setArea(area);
		land.setLandDescription(description);
		land.setLandTitle(title);
		land.setCity(city);
		land.setOffertype(offer);
		land.setTotalKatha(Double.parseDouble(size));
		land.setPricePerKatha(Double.parseDouble(price));
		land.setUsername(username);
		
	
		
		LandAdapter la = new LandAdapter();
		la.insert(land);
		
		
		
	}

}
