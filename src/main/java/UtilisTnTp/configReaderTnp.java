package UtilisTnTp;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReaderTnp {
   Properties configProp=new Properties();
   public Properties intializeConfigReader() {
	  File file = new File("C:\\Users\\USER\\eclipse-workspace\\TNTNRF\\src\\main\\resourcesTn\\Config\\config.properties");
	  try {
		  FileInputStream fis = new FileInputStream(file);
		  configProp.load(fis);
	  }catch(Throwable e) {
		   e.printStackTrace();
	  }
	return configProp;
	   
   }
}
