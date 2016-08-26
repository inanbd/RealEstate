package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import adapters.DataAccess;
import models.User;

@WebServlet({ "/AddNew", "/addnew" })
@MultipartConfig(maxFileSize = 16177215)
public class AddNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/view_file.jsp");
		disp.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		User currentUser = (User)session.getAttribute("currentUser");
		//PrintWriter out = response.getWriter();
		DataAccess da = new DataAccess();
		da.executeQueryFile(request,currentUser.getUsername());
				
		
		
	}

}
