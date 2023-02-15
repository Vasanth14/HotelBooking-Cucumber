package cucOptions;


//import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src//test//java//Features//HotelBook.feature"},
glue="stepDefenitions",monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}

