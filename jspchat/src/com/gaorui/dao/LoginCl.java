package com.gaorui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gaorui.Dbcp.Dbcp;



public class LoginCl {
	
	PreparedStatement pstm=null;
	ResultSet rs=null;
	Connection conn=null;
	public boolean Logincl(String user_name,String user_password)
	{
		boolean b=false;
		Dbcp cd= new Dbcp();
		try {
			conn=cd.getConn();
			String sql="select * from t_user where user_name='"+user_name+"' and user_password='"+user_password+"'";
			pstm=conn.prepareStatement(sql);
			System.out.println(sql);
		
		
			
			rs=pstm.executeQuery();
			if(rs.next())
				{
					b=true;
				}
		} catch (Exception e) {
		
		}
	finally{
		cd.close(rs, pstm, conn);
	}
		return b;
	}
	

}
