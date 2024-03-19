package hookstnp;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactorytnp;
import UtilisTnTp.configReaderTnp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class myhooksTnp {
  WebDriver driver;
  
  @Before
  public void SetUp() {
	  Properties prop = new configReaderTnp().intializeConfigReader();
	  driver = DriverFactorytnp.intializedriver(prop.getProperty("reuired_browser"));
	  driver.get(prop.getProperty("url1"));
  }
  @After
  public void tearDown(Scenario scenario) {
	  String scenarioName = scenario.getName().replaceAll(" ","_");
		
		if(scenario.isFailed()) {
			
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot,"image/png",scenarioName);
		}
	  driver.quit();
  }
  
}
