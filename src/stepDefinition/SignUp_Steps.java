package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.BrowserFactory;
import junit.framework.Assert;
import pages.Home_Page;
import pages.Register_Page;

public class SignUp_Steps extends BrowserFactory{

	//WebDriver driver;
	public Register_Page rPage;
	public Home_Page hPage;

	@Given("^I am in Sign Up page$")
	public void i_am_in_Sign_Up_page() throws Throwable {
		rPage = new Register_Page(getDriver());
		hPage = new Home_Page(getDriver());
	    getDriver().get("http://www.phptravels.net/register");
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
	    String result = hPage.getRegisteredName();
	    Assert.assertEquals("firstname", result);
	    System.out.println(result);
	    getDriver().close();
	}
	
}
