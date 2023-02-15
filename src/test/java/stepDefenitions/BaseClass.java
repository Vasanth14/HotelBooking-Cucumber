package stepDefenitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import commonUtilites.CommonUtils;

import io.cucumber.java.Before;

import webdriver_manager.DriverManager;

public class BaseClass {

	
	private static final Logger LOGGER = LogManager.getLogger(BaseClass.class);
	
	@Before
	public  void beforeScenario() {
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Instantiating the BaseClass");
			CommonUtils commonutils = new CommonUtils();
			LOGGER.info("Loading the properties file");
			commonutils.loadProperties();
			LOGGER.info("Checking the Driver is null or not!");
			if (DriverManager.getDriver()==null) {
				DriverManager.launchBrowser();
				commonutils.initWebElements();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}