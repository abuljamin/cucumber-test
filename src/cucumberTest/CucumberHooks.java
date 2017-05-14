package cucumberTest;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
	
	WebDriver driver;
	
	@Before("@SignUpFeature")
	public void setUp() {
		//driver = BrowserFactory.getBrowser("chrome");
	}
	
	@After("@SignUpFeature")
	public void tearDown() {
		driver.close();
	}

}
