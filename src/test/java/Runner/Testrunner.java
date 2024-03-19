package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features={"src\\main\\resourcesTn\\Features\\facebookLogin.feature"},
                glue= {"StepDefinationTnp","hookstnp"},
                //tags = "not @RegressionTest",
                //tags="@login",
                plugin={"pretty",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
          publish=true)


public class Testrunner {

}
