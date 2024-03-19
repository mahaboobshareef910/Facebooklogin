package UtilisTnTp;

import java.util.Date;

public class commonutilistnp {
   public static final int imapicity_wait=40;
   public static final int expalicty_wait=10;
   public static final int pageload_time_wait=10;
   
   public static String getTimeStamp() {
	     Date date = new Date();
	     
	return "mahaboobshareef"+date.toString().replace(" ","_").replace(":","_")
			+"@gmail.com";
	   
   }
}
