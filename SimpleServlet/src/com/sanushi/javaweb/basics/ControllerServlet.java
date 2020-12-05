package com.sanushi.javaweb.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 
	@Override
	public void init() {
		AppSettings form1 = new AppSettings();
		form1.setFormCssClass("blueUser");
		
		AppSettings form2 = new AppSettings();
		form2.setFormCssClass("redUser");
		
		getServletContext().setAttribute("form1", form1);
		getServletContext().setAttribute("form2", form2);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setName("Sanushi");
		user.setEmail("san@gmail.com");
		
		User newUser = new User();
		newUser.setName("ABC");
		newUser.setEmail("abc@gmail.com");
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		request.setAttribute("user", user);
		request.setAttribute("new_user", newUser);
		dispatcher.forward(request, response);
	}

	 
}
