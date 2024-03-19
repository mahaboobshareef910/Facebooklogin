package StepDefinationTnp;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactorytnp;
import UtilisTnTp.commonutilistnp;
import io.cucumber.java.en.*;
import pages.AccountPagetnp;
import pages.Homepagetnp;
import pages.SingInPage;

public class LoginGmail {
	WebDriver driver;
	private SingInPage signIn;
	private AccountPagetnp accountpage;
	private commonutilistnp commonutilis;
	 private Homepagetnp homepage;
	@Given("user navigate to Gmail_loginpage")
	public void user_navigate_to_gmail_loginpage() {
	 driver = DriverFactorytnp.getDriver();
	  homepage=new  Homepagetnp(driver);
	  homepage.ClickonGmail();
	  
	}

	@When("user clicks on SigninOption")
	public void user_clicks_on_signin_option() {
	    homepage.ClickonSign();
	}

	@When("^user enters valid email address (.+) into email field$")
	public void user_enters_valid_email_address_into_email_field(String emailtext) {
	    signIn.EmailField(emailtext);
	}

	@When("user click on nextbutton")
	public void user_click_on_nextbutton() {
	   signIn.ClickOnNext();
	}

	@When("^user enters valid password (.+) into password field$")
	public void user_enters_valid_password_into_password_field(String passwordtext) {
	     signIn.EnterPasswordField(passwordtext);
	}

	@When("user clicks on nextbutton")
	public void user_clicks_on_nextbutton() {
	    signIn.ClickOnNext();
	}

	@Then("user LoginAccountpage with GmailLogo")
	public void user_login_accountpage_with_gmail_logo() {
	    Assert.assertTrue(accountpage.displayImageofGmail_logo());
	}

	@When("user enters Invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String Invalidpassword) {
	    signIn.EnterPasswordField(Invalidpassword);
	}

	@Then("user get proper Warning Message")
	public void user_get_proper_warning_message() {
	   Assert.assertTrue(signIn.getWarningMessageText().contains("Wrong password. Try again or click Forgot password to reset it."));
	}

}
