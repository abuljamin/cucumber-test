package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		tags = {"@SignUp1"},
		glue = {"stepDefinition"}
		)

public class TestRunner {

}
