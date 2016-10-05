package seleniumtutorial;

import org.testng.annotations.Test;

import page.classes.SearchPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

//@Listeners(utilities.SeleniumListeners.class) better way is to use testng.xml
public class TestNG_TestCase {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	private String baseUrl;
	static Logger log = Logger.getLogger(UsingLog4j.class);

	@BeforeMethod
	public void beforeMethod() {
		PropertyConfigurator.configure("log4j.properties");
		driver = new FirefoxDriver();	// to avoid initialization error
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
	  }
	
  @Test
  public void testMethod() {
	  driver.get(baseUrl);
	  SearchPage.navigateToFlightsTab(driver);
	  SearchPage.fillOriginTextBox(driver, "New York");
	  SearchPage.fillDestinationTextBox(driver, "Chicago");
	  SearchPage.fillDepartureDateTextBox(driver, "9/25/2016");
	  SearchPage.fillReturnDateTextBox(driver, "10/30/2016");
	  SearchPage.clickOnSearchButton(driver);  
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.quit();
  }

}
