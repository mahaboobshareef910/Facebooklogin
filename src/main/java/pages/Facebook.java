package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilisTnTp.ElementsutilisTnp;
import UtilisTnTp.commonutilistnp;

public class Facebook {
	 WebDriver driver;
	 private ElementsutilisTnp elementsutils;
	 public Facebook(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 elementsutils=new ElementsutilisTnp(driver);
	 }
	 @FindBy(xpath="//*[@id='email']")
	 private WebElement EmailfieldFB;
	 public void enteremailfieldFB(String emailtext) {
		 elementsutils.javaScriptTypeText(EmailfieldFB,emailtext,commonutilistnp.expalicty_wait);
	}
	 
	 @FindBy(xpath="//*[@id='pass']")
	 private WebElement PasswordfieldFB;
	 public void enterpasswordfieldFB(String passwordtexttext) {
		 elementsutils.typeToBeText(PasswordfieldFB, passwordtexttext, commonutilistnp.expalicty_wait);
	 }
	 
	 @FindBy(xpath="//*[@name='login']")
	 private  WebElement clickOnFBLogin;
	 public AccountPagetnp clickOnFacebookLogin() {
		 elementsutils.javaScriptClick(clickOnFBLogin,commonutilistnp.expalicty_wait);
		return new AccountPagetnp(driver);
	 }
	 
	 
	 
	
}
