package com.gaorui.controller;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaorui.dao.LoginCl;


public class LoginServlet extends HttpServlet {
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");  
		response.setCharacterEncoding("utf-8");
	     String Username=request.getParameter("Username");
	     String Password=request.getParameter("Password");
/*	     String ip1 = request.getRemoteAddr();
	   
	     System.out.println("到访IP地址"+ip1);
	     GetAddressByIp gb = new GetAddressByIp();
	     System.out.println("dfsdfs"+gb.GetAddressByIp(ip1));*/
	   
	   
	     System.out.println(Username+""+Password);
	     LoginCl lgc=new LoginCl();
	     if(Username.equals("grais")&&Password.equals("yeyuan0110"))
	     	{
	    	 	String username = Username;
	    	 	HttpSession session =request.getSession();
	    		session.removeAttribute("Username"); 
	    	 	session.setAttribute("username",username);
	    	 	request.getRequestDispatcher("manage.jsp").forward(request, response); 
	     	}
	     else if(lgc.Logincl(Username, Password))
	     	{
	    	 		HttpSession session = request.getSession(true);
	    	 		session.removeAttribute("Username");  
		        	session.setAttribute("Username", Username);
	    	 	request.getRequestDispatcher("main.jsp").forward(request, response);
	     	}
	     else 
	     {
	    	 request.setAttribute("no","Account or password error");
	    	 request.getRequestDispatcher("index.jsp").forward(request, response);
	    	 
	     }
	}

}
