package webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager {

	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
	private static WebDriver driver = null;
	public static void launchBrowser() {
		try {
			
			switch (Constants.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("chrome driver is started");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();

			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	
}
