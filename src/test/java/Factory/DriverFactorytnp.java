package Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtilisTnTp.commonutilistnp;

public class DriverFactorytnp {
  static WebDriver driver=null;
  
  public static WebDriver intializedriver(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver(); 
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		 driver = new FirefoxDriver();  
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver();
	  }
	  driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(commonutilistnp.expalicty_wait));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(commonutilistnp.imapicity_wait));
	return driver;
	 }
  
  public static WebDriver getDriver() {
	return driver;
	  
  }
  }


