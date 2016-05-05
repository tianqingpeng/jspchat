package com.gaorui.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static int id =0;  
    /**
     * @see HttpServlet#HttpServlet()
     */
  
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
		HttpSession session = request.getSession();
		System.out.println(session.getId()+"----登录用户");
		session.setAttribute("user",session.getId());
		if(session.isNew()){
			System.out.println("这个是新的Session"+session.getId()+"Create---time"+session.getCreationTime());
		}
		System.out.println(session.getLastAccessedTime()+"last---time");
		System.out.println("getServletContext()"+session.getServletContext().getContextPath());
	}

}
