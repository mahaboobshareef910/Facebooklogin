package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilisTnTp.ElementsutilisTnp;
import UtilisTnTp.commonutilistnp;


public class AccountPagetnp {
	WebDriver driver;
	 private ElementsutilisTnp elementsutils;
	 public AccountPagetnp(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 elementsutils=new ElementsutilisTnp(driver);
	 }

	 @FindBy(xpath="//*[@aria-hidden='true'][@style='width:109px;height:40px']")
	 private WebElement displayimageOFSymbol;
	 
		
		public boolean displayImageofGmail_logo() {
			
			return elementsutils.dispalystatusofwebelement(displayimageOFSymbol,commonutilistnp.expalicty_wait);
			
		}
	
		 @FindBy(xpath="//*[@class='xe3v8dz']")
		 private WebElement displayLogoFaceBook;
		 public boolean display_FaceBookLogo() {
			return elementsutils.dispalystatusofwebelement(displayLogoFaceBook,commonutilistnp.imapicity_wait);
			 
		 }
}
