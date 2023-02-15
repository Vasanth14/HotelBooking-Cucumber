package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
    @FindBy(id="username")
	public static WebElement USERNAME;
	
	@FindBy(id="password")
	public static WebElement PASSWORD;
	
	@FindBy(id="login")
	public static WebElement LOGIN_BUTTON;
	
	
	
}
