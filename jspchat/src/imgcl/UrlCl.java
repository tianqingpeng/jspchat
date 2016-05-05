/*package imgcl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.gaorui.Dbcp.Dbcp;
import com.gaorui.model.img;


public class UrlCl {
	private  Connection conn=null;
	private  PreparedStatement pstm=null;
	private  ResultSet rs=null;
  public  void urlcl()
  {
	  Dbcp cd=new Dbcp();
	  try {
		  conn=cd.getConn();
		  getUrl gu=new getUrl();
		  ArrayList<img> al=gu.getImg_Url();
		  for(int i=0;i<al.size();i++)
		  	{
			  img im=al.get(i);
			  System.out.println("im:"+im);
			  String sql="insert into img(img_url) value('"+im.getImg_url()+"')";
			  System.out.println("sql"+sql);
			  pstm=conn.prepareStatement(sql);
			  pstm.executeUpdate();
		  	}
		  System.out.println("加载完成");
		
	} catch (Exception e) {
	  e.printStackTrace();
	}
	  finally{
		  cd.close(rs, pstm, conn);
	  }
	  
  }
}
*/