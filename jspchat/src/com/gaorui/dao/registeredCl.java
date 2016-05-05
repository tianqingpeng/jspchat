package com.gaorui.dao;

import com.gaorui.Dbcp.Dbcp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class registeredCl {
	
	PreparedStatement pstm=null;
	ResultSet rs =null;
	Connection conn=null;
	public boolean registeredcl(String user_id,String Username,String Password)
	{
		boolean b=false;
		Dbcp cd=new Dbcp();
		try {
			conn=cd.getConn();
		String sql="insert into t_user(user_id,user_name,user_password) value('"+user_id+"','"+Username+"','"+Password+"')";
		pstm=conn.prepareStatement(sql);
		int num=pstm.executeUpdate();
		if(num==1)
			{	
				b=true;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			cd.close(rs, pstm, conn);
		}
		return b;
	}
}
