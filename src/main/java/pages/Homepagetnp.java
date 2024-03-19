package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilisTnTp.ElementsutilisTnp;
import UtilisTnTp.commonutilistnp;

public class Homepagetnp {
 WebDriver driver;
 private ElementsutilisTnp elementsutils;
 public Homepagetnp(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 elementsutils=new ElementsutilisTnp(driver);
 }
@FindBy(xpath="//*[@class='gb_H'][@aria-label='Gmail (opens a new tab)']")
private WebElement GmailOption;
public void ClickonGmail() {
	elementsutils.clickonElement(GmailOption,commonutilistnp.expalicty_wait);
 }
@FindBy(xpath="//*[@data-action='sign in']")
private WebElement SignInOption;
public SingInPage ClickonSign() {
	elementsutils.clickonElement(SignInOption,commonutilistnp.imapicity_wait);
	return new  SingInPage(driver);
}

}
