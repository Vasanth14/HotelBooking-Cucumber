package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelPageObjects {

	@FindBy(id="location")
	public static WebElement hotelLocation;
	
	@FindBy(id="hotels")
	public static WebElement hotelName;
	
	@FindBy(id="room_type")
	public static WebElement roomType;
	
	@FindBy(id="room_nos")
	public static WebElement roomNos;
	
	@FindBy(id="datepick_in")
	public static WebElement dateIn;
	
	@FindBy(id="datepick_out")
	public static WebElement dateout;
	
	@FindBy(id="adult_room")
	public static WebElement adultRum;
	
	@FindBy(id="child_room")
	public static WebElement chilNos;
	
	@FindBy(id="Submit")
	public static WebElement search;
	
	
}
