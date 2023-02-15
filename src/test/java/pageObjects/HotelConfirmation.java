package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver_manager.DriverManager;

public class HotelConfirmation {

	@FindBy(id="radiobutton_0")
	public static WebElement select;
	
	@FindBy(id="continue")
	public static WebElement submt;
	
	@FindBy(id="first_name")
	public static WebElement firstName;
	
	@FindBy(id="last_name")	
	public static WebElement lastName;
	
	@FindBy(id="address")
	public static WebElement addr;
	
	@FindBy(id="cc_num")
	public static WebElement cardNo;
	
	@FindBy(id="cc_type")
	public static WebElement cardTyp;
	
	@FindBy(id="cc_exp_month")
	public static WebElement cardExpMonth;
	
	@FindBy(id="cc_exp_year")
	public static WebElement cardExpYear;
	
	@FindBy(id="cc_cvv")
	public static WebElement cardCvv;
	
	@FindBy(id="book_now")
	public static WebElement book;
	
		
	
	
	
	
}
