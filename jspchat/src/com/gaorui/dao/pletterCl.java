package com.gaorui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.gaorui.Dbcp.Dbcp;
import com.gaorui.model.message;

public class pletterCl {

	PreparedStatement pstm=null;
	ResultSet rs =null;
	Connection conn=null;
	public String getFromorToidbyfromname(String name)
	{
		String user_id = null;
		Dbcp cd= new Dbcp();
		try {
			conn=cd.getConn();	
			String sql = "SELECT user_id FROM t_user WHERE user_name='"+name+"'";
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			if(rs.next()){
				 user_id = rs.getString("user_id");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally
			{
				cd.close(conn,pstm, rs);
			}
		return user_id;
	}
	
	
	public String getUsernamebyto_userid(String id)
	{
		String username = null;
		Dbcp cd= new Dbcp();
		try {
			conn=cd.getConn();	
			String sql = "SELECT user_name FROM t_user WHERE user_id='"+id+"'";
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			if(rs.next()){
				 username = rs.getString("user_name");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally
			{
				cd.close(conn,pstm, rs);
			}
		return username;
	}
	
	
	public boolean plettercl(String fromid,String toid,String content){
		boolean b = false;
		Dbcp cd= new Dbcp();
		try {
				conn=cd.getConn();	
				String sql = "INSERT INTO pletter(fromuser_id,touser_id,p_content) VALUES('gr-xws','"+toid+"','"+content+"')";
				pstm=conn.prepareStatement(sql);
				int a = pstm.executeUpdate();
				if(a>0){
					b=true;
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally
			{
				cd.close(conn,pstm, rs);
			}		
		return b;	
	}
	public boolean replyplettercl(String fromid,String toid,String content){
		boolean b = false;
		Dbcp cd= new Dbcp();
		try {
				conn=cd.getConn();	
				String sql = "INSERT INTO pletter(fromuser_id,touser_id,p_content) VALUES('"+fromid+"','gr-xws','"+content+"')";
				pstm=conn.prepareStatement(sql);
				int a = pstm.executeUpdate();
				if(a>0){
					b=true;
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally
			{
				cd.close(conn,pstm, rs);
			}		
		return b;	
	}
	
}
