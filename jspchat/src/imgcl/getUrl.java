/*package imgcl;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gaorui.model.img;



public class getUrl {
	 public static ArrayList<img> getImg_Url()
	    {
		 	ArrayList<img> al=new ArrayList<img>();
	    	String url = "http://www.jgtj.com.cn/hhezuo/2014/1201/10992.html";  
	    	Document doc;
	    	String img_url=null;
			try {
				doc = Jsoup.connect(url).get();
			    Elements media = doc.select("[src]");  
			    for (Element src : media) {  
		            if (src.tagName().equals("img"))  
		            {
		            img_url="<"+src.tagName()+" "+"src="+src.attr("abs:src")+">";
		            img_url=src.attr("abs:src");
		            System.out.println("测试img:"+img_url);
		            img im=new img();
		            im.setImg_url(img_url);
		            al.add(im);
		            }
			    } 
			    
			    }catch (IOException e) {
				
				e.printStackTrace();
			}  
	    	return al;
	    }
}
*/