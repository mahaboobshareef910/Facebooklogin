package StepDefinationTnp;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;



import Factory.DriverFactorytnp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPagetnp;
import pages.Facebook;

public class Facebooklogin {
	WebDriver driver;
	private Facebook facebookpage;
	private AccountPagetnp accountpage;
	
	@Given("user naviate to Facebook home page")
	public void user_naviate_to_facebook_home_page() {
		 driver = DriverFactorytnp.getDriver();
		 facebookpage = new Facebook(driver);
	}

	@When("user enter facebookmailId into {string} emailField")
	public void user_enter_facebookmail_id_into_email_field(String emailtext) {
	     facebookpage.enteremailfieldFB(emailtext);
	}

	@When("user enter Password into {string} PasswordField")
	public void user_enter_password_into_password_field(String passwordtext) {
	    facebookpage.enterpasswordfieldFB(passwordtext);
	}

	@When("user clicksOn Login button")
	public void user_clicks_on_login_button() {
	    facebookpage.clickOnFacebookLogin();
	}

	@Then("user successfully loginWith FaceBook_Logo")
	public void user_successfully_login_with_face_book_logo() {
		 accountpage = new AccountPagetnp(driver);
	    Assert.assertTrue(accountpage.display_FaceBookLogo());
	}
         
}
