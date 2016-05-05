package com.gaorui.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaorui.dao.messageCl;
import com.gaorui.model.message;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class messageshowServlet
 */
public class messageshowpesronuser extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");//转换，解决乱码。
		PrintWriter pw=response.getWriter();
		JSONObject ResultJson=new JSONObject();
		JSONObject jsonObject1=new JSONObject();
		JSONObject jsonObject2=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		messageCl mec=new messageCl();
		
		ArrayList<message> al1 = mec.getfrom_ids();
	
		for(int i=0;i<al1.size();i++){
			
				message me1 =al1.get(i);
				
					jsonObject1.put("from_id", me1.getUser_id());
					jsonArray.add(jsonObject1);
				}

			
			
		

			ResultJson.put("students",jsonArray);
			pw.println(ResultJson);
			pw.flush();
			pw.close(); 
		
	}
}
