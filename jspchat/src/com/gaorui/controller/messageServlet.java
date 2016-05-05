package com.gaorui.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.gaorui.dao.messageCl;
import com.gaorui.dao.pletterCl;


public class messageServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");  
		response.setCharacterEncoding("utf-8");
		String user_name=request.getParameter("param");
		System.out.println("User_id"+user_name);
			pletterCl pcl = new pletterCl();
		String 	fromuserid = pcl.getFromorToidbyfromname(user_name);
		String me_node=request.getParameter("message");
		String me_node2 = new String(me_node.getBytes("iso-8859-1"),"utf-8");
		System.out.println(""+me_node2);
		messageCl mec=new messageCl();
		if(mec.messagecl(me_node2,user_name,fromuserid))
			{
				request.setAttribute("ok","Message successfully");
				request.getRequestDispatcher("main.jsp").forward(request,response); 
			}
		else
		{
			request.getRequestDispatcher("main.jsp").forward(request,response); 
		}
		
	}

}
