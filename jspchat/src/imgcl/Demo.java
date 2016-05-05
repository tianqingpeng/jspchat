/*package imgcl;
import java.io.IOException;


public class Demo {  
    public static void main(String[] args) throws IOException {           
    	
    	flush fl=new flush();
    	fl.start();
    
    }
}  
 class flush extends Thread{
	 public void run(){
	 while(true)
	 	{
		 try {
				Thread.sleep(60000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 	System.out.println("已启动线程");
		 	UrlCl ucl=new UrlCl();
	    	ucl.urlcl();
	    
	 	} 
}
	 }*/