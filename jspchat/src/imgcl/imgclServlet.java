/*package imgcl;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaorui.model.img;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class imgclServlet extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
        JSONObject ResultJson=new JSONObject();
        JSONArray jsonArray=new JSONArray();
        JSONObject jsonObject=new JSONObject();
        imgcl gu=new imgcl();
        ArrayList<img> al=gu.getImg_url();
        for(int i=0;i<al.size();i++)
        	{
        		img im=al.get(i);
        		jsonObject.put("url",im.getImg_url());
        		jsonArray.add(jsonObject);
        		System.out.println(im.getImg_url());
        	}
        ResultJson.put("Imgs",jsonArray);
        pw.println(ResultJson);
        pw.flush();
        pw.close();
	}

}
*/