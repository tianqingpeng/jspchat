package com.gaorui.DbcpHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gaorui.Dbcp.Dbcp;

public class DbcpHelper {
	PreparedStatement pstm=null;
	ResultSet rs=null;
	Connection conn=null;
	Dbcp cd=new Dbcp(); 
	public int updateCl(String sql)
		{ 
			int a=0;
			try {
				conn=cd.getConn();
				pstm=conn.prepareStatement(sql);
			 a=pstm.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally{
				cd.close(rs, pstm, conn);
			}
			return a;
		}
	public Object select(String sql)
		{
		Object object=null;
			conn=cd.getConn();
			try {
				pstm=conn.prepareStatement(sql);
				rs=pstm.executeQuery();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally{
			 cd.close(rs, pstm, conn);
			}
			return object;
		}
}
