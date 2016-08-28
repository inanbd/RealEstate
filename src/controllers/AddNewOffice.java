package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Sessions.SessionJobs;
import adapters.AreaAdapter;
import adapters.CityAdapter;
import adapters.OfferAdapter;
import adapters.OfficeAdapter;
import models.Office;


@WebServlet({ "/AddNewOffice", "/addnewoffice" })
@MultipartConfig(maxFileSize = 16177215)
public class AddNewOffice extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CityAdapter ca = new CityAdapter();
		AreaAdapter aa = new AreaAdapter();
		OfferAdapter oa = new OfferAdapter();
		
		request.setAttribute("citylist",ca.getAll() );
		request.setAttribute("arealist",aa.getAll() );
		request.setAttribute("offerlist",oa.getAll() );
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/view_addNewOffice.jsp");
		disp.forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Office office  = new Office();
		
		String title = request.getParameter("title");
		String size = request.getParameter("size");
		String price = request.getParameter("price");
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		String city = request.getParameter("city");
		String area = request.getParameter("area");
		String offer = request.getParameter("offer");
		String address = request.getParameter("address");
		String floor = request.getParameter("floor");
		String username = new SessionJobs().getUsername(request);
		
		
		
		office.setAddress(address);
		office.setArea(area);
		office.setCategory(category);
		office.setCity(city);
		//office.setDate(date);
		office.setOffertype(offer);
		office.setFloor(floor);
		office.setOfficeTitle(title);
		office.setPrice(Double.parseDouble(price));
		office.setOfficeDescription(description);
		office.setSizeInSqFeet(Double.parseDouble(size));
		office.setUsername(username);
		
		
		
		OfficeAdapter  oa = new OfficeAdapter();
		oa.insert(office);
		
		
		CityAdapter ca = new CityAdapter();
		AreaAdapter aa = new AreaAdapter();
		OfferAdapter ofa = new OfferAdapter();
		
		request.setAttribute("citylist",ca.getAll() );
		request.setAttribute("arealist",aa.getAll() );
		request.setAttribute("offerlist",ofa.getAll() );
		request.setAttribute("Message", "Office Added");
		
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/view_addNewOffice.jsp");
		disp.forward(request, response);
		
	}

}
