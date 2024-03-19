package UtilisTnTp;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsutilisTnp {
 WebDriver driver;
 
 public ElementsutilisTnp(WebDriver driver) {
	 this.driver=driver;
	 }
 public WebElement waitForElement(WebElement element,long durationInSeconds) {
	   WebElement webelement = null;
	   try {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
	     webelement = wait.until(ExpectedConditions.elementToBeClickable(element));
	   }catch(Throwable e) {
		   e.printStackTrace();
	   }
	return webelement;
}
 public void clickonElement(WebElement element,long durationInSeconds) {
	 WebElement webelement = waitForElement(element,durationInSeconds);
	  webelement.click();
 }
 
 public void javaScriptClick(WebElement element,long durationInSeconds) {
	 WebElement webelement = waitForElement(element,durationInSeconds);
	 JavascriptExecutor jse = ((JavascriptExecutor)driver);
	 jse.executeScript("arguments[0].click();",webelement);
}
 
 public void typeToBeText(WebElement element,String textToBeType,long durationInSeconds) {
	 WebElement webelement = waitForElement(element,durationInSeconds);
	  webelement.click();
	  webelement.clear();
	  webelement.sendKeys(textToBeType);
 }
 
 public void javaScriptTypeText(WebElement element,String textToBeType,long durationInSeconds) {
	 WebElement webelement = waitForElement(element,durationInSeconds);
	 JavascriptExecutor jse = ((JavascriptExecutor)driver);
	 jse.executeScript("arguments[0].value='"+textToBeType+"'",webelement);
}
 
 public String getTextfromElement(WebElement element,long durationInSeconds) {
	  WebElement webelement=waitForElement(element,durationInSeconds);
	 return webelement.getText();
}
 public boolean dispalystatusofwebelement(WebElement element,long durationInSeconds) {
	 try {
	 WebElement webelement=waitForElement(element,durationInSeconds);
	 return webelement.isDisplayed();
	 }catch(Throwable e) {
			return false;
		}
}
}