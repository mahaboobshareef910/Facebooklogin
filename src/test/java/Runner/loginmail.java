package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginmail {
WebDriver driver;
@BeforeMethod
 @Test(priority=0)
 public void logingamil() throws InterruptedException {
	driver = new ChromeDriver();
	driver.get("https://www.google.com/index.html");
	driver.findElement(By.xpath("//*[@class='gb_H'][@aria-label='Gmail (opens a new tab)']")).click();
	driver.findElement(By.xpath("//*[@data-action='sign in']")).click();
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mahaboobshareef787@gmail.com");
     ////*[@style='height:40px;width:40px'][@x='0'][@y='0'][@height='100%']--logout
	driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();

	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("9603205826mabu@");
	
	driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
	
	driver.findElement(By.xpath("//*[@class='gb_d gb_Fa gb_J']")).click();
	}
@AfterMethod
	public void teatdown() {
	driver.quit();
	}
	}
 
