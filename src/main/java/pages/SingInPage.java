package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilisTnTp.ElementsutilisTnp;
import UtilisTnTp.commonutilistnp;

public class SingInPage {
 WebDriver driver;
 private ElementsutilisTnp elementsutils;
 public SingInPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 elementsutils=new ElementsutilisTnp(driver);
 }
 @FindBy(xpath="//*[@type='email']")
 private WebElement Enter_email_field;
 public void EmailField(String emailtext) {
 elementsutils.typeToBeText(Enter_email_field,emailtext,commonutilistnp.imapicity_wait); 
 }
@FindBy(xpath="//*[contains(text(),'Next')]")
 private WebElement nextOption;
 public void ClickOnNext() {
	 elementsutils.clickonElement(nextOption,commonutilistnp.expalicty_wait);
 }
 @FindBy(xpath="//*[@type='password']")
 private WebElement password_field;
 public void EnterPasswordField(String passwordtext) {
	 elementsutils.typeToBeText(password_field, passwordtext,commonutilistnp.expalicty_wait);
 }
 @FindBy(xpath="//*[contains(text(),'Next')]")
 private WebElement clickOnnext;
 public AccountPagetnp lickOnLoginNextButton() {
	 elementsutils.clickonElement(clickOnnext,commonutilistnp.expalicty_wait);
	return new AccountPagetnp(driver);
}
 @FindBy(xpath="//*[contains(text(),'Wrong password. Try again or click Forgot password to reset it.')]")
 private WebElement warningmessgaeforInvalidpassword;
 public String getWarningMessageText() {
	return elementsutils.getTextfromElement(warningmessgaeforInvalidpassword,commonutilistnp.expalicty_wait);
	 
 }
}