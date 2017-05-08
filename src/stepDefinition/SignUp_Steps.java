package stepDefinition;

import java.io.Console;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Register_Page;

public class SignUp_Steps {
	
	public static WebDriver driver;
	public Register_Page rPage;

	@Given("^I am in Sign Up page$")
	public void i_am_in_Sign_Up_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    rPage = new Register_Page(driver);
	    driver.get("http://www.phptravels.net/register");
	}

	@When("^I input valid \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void i_input_valid_firstName_lastName_mobileNumber_email_password_confirmPassword(String firstName, String lastName, String mobileNumber, String email, String password, String confirmPassword) throws Throwable {
		rPage.fillRegisterForm(firstName, lastName, mobileNumber, email, password, confirmPassword);
	}

	@When("^click Sign Up button$")
	public void click_Sign_Up_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rPage.clickSignUpButton();
	}

	@Then("^I sign up successfully and system redirect me to Home page with my account")
	public void i_sign_up_successfully_and_system_redirect_me_to_Home_page_with_my_account() throws Throwable {
	    String result = driver.findElement(By.xpath("//a[contains(text(), 'firstname')]")).getText();
	    Assert.assertEquals("firstname", result);
	    System.out.println(result);
	    driver.close();
	}
	
}
