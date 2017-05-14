package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BrowserFactory.driver = driver;
	}
	
	public BrowserFactory() {
		initBrowser();
	}
	
	private static WebDriver getBrowser(String browserType) {
		if(getDriver() == null) {
			if(browserType == "firefox") {
				System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
				setDriver(new FirefoxDriver());
			    getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    getDriver().manage().window().maximize();
			} else if(browserType == "chrome") {
				System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
				setDriver(new ChromeDriver());
			    getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    getDriver().manage().window().maximize();
			}
		}
		return getDriver();
	}
	
	private static void initBrowser() {
		setDriver(getBrowser("chrome"));
		System.out.println(getDriver());
	}
	
}
