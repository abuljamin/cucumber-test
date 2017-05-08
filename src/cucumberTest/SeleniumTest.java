package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.net/");
	}

}
