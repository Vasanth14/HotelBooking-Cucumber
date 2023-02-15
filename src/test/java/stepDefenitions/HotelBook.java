package stepDefenitions;

import org.openqa.selenium.support.ui.Select;

import commonUtilites.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.BookHotelPageObjects;
import pageObjects.HotelConfirmation;

public class HotelBook {
	CommonUtils util= new CommonUtils();
    @Then("^user selects (.+) and (.+) and (.+) and (\\d+)$")
    public void user_selects_and_and_and_something_and_something_and_something(String location, String hotelname, String roomtype, int arg1) throws Throwable {
    	System.out.println("user is in the search hotel page");
	    Select select=new Select(BookHotelPageObjects.hotelLocation);
	    select.selectByVisibleText(location);
	    Select select1=new Select(BookHotelPageObjects.hotelName);
	    select1.selectByVisibleText(hotelname);
	    Select select2 = new Select (BookHotelPageObjects.roomType);
	    select2.selectByVisibleText(roomtype);
	    Select select3 = new Select (BookHotelPageObjects.chilNos);
	    select3.selectByIndex(arg1);
	    
    }

    @And("^user searches for hotel$")
    public void user_searches_for_hotel() throws Throwable {
        BookHotelPageObjects.search.click();
        HotelConfirmation.select.click();
        HotelConfirmation.submt.click();
        
        
	
    }
    
    @Then("^user confirms the hotel with (.+) and (.+) and (.+)$")
    public void user_confirms_the_hotel_with_and_and_and_1234567898765432_and_and_and_500(String firstname, String lastname, String billingaddr) throws Throwable {
        HotelConfirmation.firstName.sendKeys(firstname);
        HotelConfirmation.lastName.sendKeys(lastname);
        HotelConfirmation.addr.sendKeys(billingaddr);
        CommonUtils util= new CommonUtils();
        util.card();
        util.cardType();
        util.cardMon();
        util.cardYr();
        util.cardCVv();
        HotelConfirmation.book.click();
        
    }

    
}
