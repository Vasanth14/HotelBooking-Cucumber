package commonUtilites;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import pageObjects.BookHotelPageObjects;
import pageObjects.HotelConfirmation;
import pageObjects.LoginPage;
import webdriver_manager.DriverManager;

public class CommonUtils {

	public void loadProperties() {
		
		Properties properties = new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Constants.APP_URL= properties.getProperty("APP_URL");
		Constants.BROWSER= properties.getProperty("BROWSER");
	}
	
	public void initWebElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.class);
		PageFactory.initElements(DriverManager.getDriver(), BookHotelPageObjects.class);
		PageFactory.initElements(DriverManager.getDriver(), HotelConfirmation.class);
		
		
		
	}
	public void card() {
		HotelConfirmation.cardNo.sendKeys("1234567898765432");
	}
	public void cardType() {
		Select s = new Select(HotelConfirmation.cardTyp);
		s.selectByVisibleText("VISA");
	}
	public void cardMon() {
		Select s1 = new Select(HotelConfirmation.cardExpMonth);
		s1.selectByVisibleText("May");
	}
	public void cardYr() {
		Select s2 = new Select(HotelConfirmation.cardExpYear);
		s2.selectByVisibleText("2022");
	}
	public void cardCVv() {
		HotelConfirmation.cardCvv.sendKeys("500");
	}

}
