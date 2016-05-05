package com.gaorui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.gaorui.Dbcp.Dbcp;
import com.gaorui.model.message;
public class messageCl {
	PreparedStatement pstm=null;
	ResultSet rs =null;
	Connection conn=null;
	public boolean messagecl(String me_node,String user_name,String fromuserid)
	{
		boolean b=false;
		Dbcp cd= new Dbcp();
		try {
			conn=cd.getConn();	
			String sql="INSERT INTO pletter(fromuser_id,touser_id,p_content) VALUES('"+fromuserid+"','gr-xws','"+me_node+"')";
			pstm=conn.prepareStatement(sql);
			int num=pstm.executeUpdate();
			if(num==1)
				{
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
	public ArrayList<message> getmessage(String from_id)
	{
		ArrayList<message> al= new ArrayList<message>();
		Dbcp cd=new Dbcp();
		try {
			conn=cd.getConn();
			String sql="select fromuser_id,p_content from pletter where touser_id='gr-xws' and fromuser_id='"+from_id+"'";
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				message me=new message();
				
				me.setMe_node(rs.getString("p_content"));
				me.setUser_id(rs.getString("fromuser_id"));
				al.add(me);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		finally{
			cd.close(rs, pstm, conn);;
		}
		return al;		
	}
	
	
	public ArrayList<message> plettercl(String to_id,String form_id)
	{
		ArrayList<message> al= new ArrayList<message>();
		Dbcp cd=new Dbcp();
		try {
			conn=cd.getConn();
			String sql="	SELECT *FROM pletter WHERE( touser_id='"+to_id+"' OR touser_id='"+form_id+"') AND (fromuser_id='"+form_id+"' OR fromuser_id='"+to_id+"' )";
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				message me=new message();
				me.setMe_node(rs.getString("p_content"));
				me.setUser_id(rs.getString("fromuser_id"));
				me.setUser_name(rs.getString("touser_id"));
				al.add(me);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		finally{
			cd.close(rs, pstm, conn);;
		}
		return al;		
	}
	
	
	
	public ArrayList<message> plettercl1(String from_id)
	{
		ArrayList<message> al= new ArrayList<message>();
		Dbcp cd=new Dbcp();
		try {
			conn=cd.getConn();
			String sql="SELECT touser_id,p_content FROM pletter WHERE fromuser_id='"+from_id+"'";
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				message me=new message();
				me.setMe_node(rs.getString("p_content"));
				me.setUser_id(rs.getString("touser_id"));
				me.setUser_name(from_id);
				al.add(me);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		finally{
			cd.close(rs, pstm, conn);;
		}
		return al;		
	}
	
	
	
	public String  getfrom_idbyto_id(String to_id)
	{
		String from_id=null;
		ArrayList<message> al= new ArrayList<message>();
		Dbcp cd=new Dbcp();
		try {
			conn=cd.getConn();
			String sql="SELECT fromuser_id FROM pletter WHERE touser_id ='"+to_id+"'";
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				 from_id = rs.getString("fromuser_id");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		finally{
			cd.close(rs, pstm, conn);;
		}
		return from_id;		
	}
	
	public ArrayList<message> getfrom_ids()
	{
		ArrayList<message> al= new ArrayList<message>();
		Dbcp cd=new Dbcp();
		try {
			conn=cd.getConn();
			String sql="SELECT fromuser_id FROM pletter WHERE touser_id='gr-xws' GROUP BY fromuser_id";
			pstm=conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				message me=new message();
				me.setUser_id(rs.getString("fromuser_id"));
				al.add(me);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		finally{
			cd.close(rs, pstm, conn);;
		}
		return al;		
	}
	
	
}
