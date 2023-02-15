package stepDefenitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import constants.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import webdriver_manager.DriverManager;

public class AdacDemo {
	
private static final Logger LOGGER= LogManager.getLogger(AdacDemo.class);

    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() throws Throwable {
    System.out.println("hello");
    DriverManager.getDriver().get(Constants.APP_URL);
    
    }

    @When("^user enters (.+) and (.+)$")
    public void user_enters_and(String user, String pass) throws Throwable {
    	System.out.println("hi");
    	LoginPage.USERNAME.sendKeys(user);
    	LoginPage.PASSWORD.sendKeys(pass);
    	LoginPage.LOGIN_BUTTON.click();
    	LOGGER.info("logged in");
    	
    	
    	
    }

    @And("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
       System.out.println("Successfully logged in");
    }

}
