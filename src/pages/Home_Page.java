package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(), 'firstname')]")
	WebElement registeredFirstNameText;
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getRegisteredName() {
		return registeredFirstNameText.getText();
	}

}
