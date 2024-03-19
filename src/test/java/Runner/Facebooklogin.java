package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Facebooklogin {
	WebDriver driver;
@Test(priority=1)
public void loginFacebookAccoutvalidCredentials()  {
	driver = new ChromeDriver();
	//facebook
	driver.get("https://www.facebook.com/");
	//email
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mahaboobshareef.543");
	//password
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("9603205826mabu@");
	//login
	driver.findElement(By.xpath("//*[@name='login']")).click();
     System.out.println(driver.getTitle());
     System.out.println("--------------");
          driver.quit();
}
}
