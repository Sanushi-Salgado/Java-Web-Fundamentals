package com.sanushi.javaweb.basics;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author - S Salgado 
 * Date   - 29/11/2020
 */
@WebServlet(urlPatterns = { "/home", "*.abc" }, initParams = {
		@WebInitParam(name = "AppName", value = "Demo Servlet") })
public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	String appName;

	@Override
	public void init() {
		appName = getInitParameter("AppName");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		if (name != null) {
			response.setContentType("text/xml");
			response.getWriter().printf("<application><greeting>Hello %s</greeting><app>%s</app></application>", name,
					appName);
		} else
			response.getWriter().append("Hello World!");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		if (name != null && !name.isEmpty())
			response.getWriter().printf("Hello %s", name);
		else
			response.sendRedirect("index.jsp");
	}

}
