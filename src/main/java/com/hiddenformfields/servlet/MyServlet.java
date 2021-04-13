package com.hiddenformfields.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registeruser")
public class MyServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		String name = req.getParameter("user_name");
		PrintWriter out = resp.getWriter();

		out.println("your name is " + name);
		out.println();
		// urlrewriting
		// out.println("<h1><a href ='servlet2?user="+name+"'>Go to this
		// page</a></h1>");
		// hidden form fields

		out.println("" + "<form action='/hiddenformfields/servlet2'>" + "<input type='hidden' name='user_name' value='"
				+ name + "'/>" + "<button>Go to second servlet </button>" + "</form>");

	}
}
