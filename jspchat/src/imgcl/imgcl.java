/*package imgcl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.gaorui.Dbcp.Dbcp;
import com.gaorui.model.img;





public class imgcl {
	  static Connection conn=null;
	  static PreparedStatement pstm=null;
	  static ResultSet rs=null;
	 public static ArrayList<img> getImg_url()
	    {
		 Dbcp cd=new Dbcp();
		 ArrayList<img> al=new ArrayList<img>();
		 try {
			 	conn=cd.getConn();
				pstm=conn.prepareStatement("select * from img");
				rs=pstm.executeQuery();
				while(rs.next())
				{
					img im=new img();
				im.setImg_url(rs.getString("img_url"));
				al.add(im);
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    finally{
	    	cd.close(rs, pstm, conn);
	    	
	    }
		 return al;
	    }
}
*/