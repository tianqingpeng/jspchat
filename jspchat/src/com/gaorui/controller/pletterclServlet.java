package com.gaorui.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaorui.dao.pletterCl;

/**
 * Servlet implementation class pletterclServlet
 */
public class pletterclServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");  
		response.setCharacterEncoding("utf-8");
		String fromname = request.getParameter("param1");
		String toname = request.getParameter("param2");
		String content = request.getParameter("message");
		String content1 = new String(content.getBytes("iso-8859-1"),"utf-8");
			pletterCl pcl = new pletterCl();
		String 	fromuserid = pcl.getFromorToidbyfromname(fromname);
		String  touserid = pcl.getFromorToidbyfromname(toname);
		boolean a = pcl.plettercl(fromuserid, touserid, content1);
		if(a){
			
			request.getRequestDispatcher("/manage.jsp").forward(request, response);
		}
	}

}
