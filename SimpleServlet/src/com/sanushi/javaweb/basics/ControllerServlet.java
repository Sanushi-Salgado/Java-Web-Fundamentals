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
		AppSettings form2 = new AppSettings();
		
		CssClass cssClass1 = new CssClass();
		cssClass1.setName("blueUser");
		
		CssClass cssClass2 = new CssClass();
		cssClass2.setName("redUser");
		
		String[] tabNames = {"SignIn", "Home", "Profile", "Settings"};
		
		form1.setFormCssClass(cssClass1);
		form2.setFormCssClass(cssClass2);
		form2.setTabNames(tabNames);
		
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
