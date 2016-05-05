package com.gaorui.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaorui.dao.messageCl;
import com.gaorui.dao.pletterCl;
import com.gaorui.model.message;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class messageshowServlet
 */
public class messageshowServlet extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");//转换，解决乱码。
		String from_id = request.getParameter("data");
		
	/*	PrintWriter pw=response.getWriter();
		JSONObject ResultJson=new JSONObject();
		JSONObject jsonObject1=new JSONObject();
		JSONObject jsonObject2=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		messageCl mec=new messageCl();
		ArrayList<message> al=mec.getmessage(from_id);
		ArrayList<message> al1 = mec.getfrom_ids();
	
		for(int i=0;i<al.size();i++){
			message me =al.get(i);
			jsonObject1.put("me_node",me.getMe_node());
			jsonObject1.put("user_name",me.getUser_id());
			
			jsonArray.add(jsonObject1);
		}
			ResultJson.put("students",jsonArray);
			pw.println(ResultJson);
			pw.flush();
			pw.close(); */
		
		
		
		
		PrintWriter pw=response.getWriter();
		JSONObject ResultJson=new JSONObject();
		JSONObject jsonObject1=new JSONObject();
		JSONObject jsonObject2=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		JSONArray jsonArray1=new JSONArray();
		HttpSession session = request.getSession();
	//	String Usernam = (String) session.getAttribute("Username");
		pletterCl pcl = new pletterCl();
		//String to_id = pcl.getFromorToidbyfromname(Usernam);
		
		messageCl mec=new messageCl();
	//	String from_id= mec.getfrom_idbyto_id(to_id);
		ArrayList<message> al=mec.plettercl("gr-xws",from_id);
		for(int i=0;i<al.size();i++)
		{
			message me =al.get(i);
			String 	fromusername = pcl.getUsernamebyto_userid(me.getUser_id());
			jsonObject1.put("me_node",me.getMe_node());
			jsonObject1.put("from_id",me.getUser_id());
			jsonObject1.put("to_id", me.getUser_name());
			jsonObject1.put("fromusername",fromusername);
			System.out.println("148测试:"+fromusername);
			jsonArray.add(jsonObject1);
		}
		
		/*for(int i=0;i<al1.size();i++)
		{
			message me =al1.get(i);
			jsonObject2.put("me_node",me.getMe_node());
			jsonObject2.put("user_name",me.getUser_id());
			jsonObject2.put("fromuser_id",Usernam);
			jsonArray.add(jsonObject2);
		}*/
		ResultJson.put("students",jsonArray);
	//	ResultJson.put("students1",jsonArray1);
		pw.println(ResultJson);
		pw.flush();
		pw.close(); 
	}
}
