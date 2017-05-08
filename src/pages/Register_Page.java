package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

	WebDriver driver;
	
	@FindBy(name="firstname")
	WebElement firstNameTextField;
	
	@FindBy(name="lastname")
	WebElement lastNameTextField;
	
	@FindBy(name="phone")
	WebElement phoneTextField;
	
	@FindBy(name="email")
	WebElement emailTextField;
	
	@FindBy(name="password")
	WebElement passwordTextField;
	
	@FindBy(name="confirmpassword")
	WebElement confirmPasswordTextField;
	
	@FindBy(xpath="//button[contains(text(), 'Sign Up')]")
	WebElement signUpButton;
	
	public Register_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillRegisterForm(String firstName, String lastName, String mobileNumber, String email, String password, String confirmPassword) {
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		phoneTextField.sendKeys(mobileNumber);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(confirmPassword);
	}
	
	public void clickSignUpButton() {
		signUpButton.click();
	}
	
}
