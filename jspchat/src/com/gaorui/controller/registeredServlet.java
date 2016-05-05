package com.gaorui.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaorui.dao.registeredCl;


public class registeredServlet extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");  
		response.setCharacterEncoding("utf-8");
	/*	String user_id=request.getParameter("Userid");*/
		String user_name=request.getParameter("Username");
		String user_password=request.getParameter("Password");
		registeredCl rgc=new registeredCl();
		if(rgc.registeredcl(user_name, user_name, user_password))
			{
				request.setAttribute("ok","ok");
				request.getRequestDispatcher("registered.jsp").forward(request, response);
			}
		else{
			request.setAttribute("no","no");
			request.getRequestDispatcher("registered.jsp").forward(request, response);
		}
	}

}
