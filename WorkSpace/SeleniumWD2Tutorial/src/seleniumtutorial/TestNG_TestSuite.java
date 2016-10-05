package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.classes.SearchPage;

public class TestNG_TestSuite {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_TestSuite.class);

	@BeforeClass
	public void beforeClass() {
		PropertyConfigurator.configure("log4j.properties");
		driver = new FirefoxDriver();	// to avoid initialization error
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
	}

	@Test
	public void test1_fillBasicInfo() throws Exception {
		driver.get(baseUrl);
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "9/20/2016");
		SearchPage.fillReturnDateTextBox(driver, "10/3/2016");
		//SearchPage.clickOnSearchButton(driver);  
		Thread.sleep(3000);
	}
	
	@Test
	public void test2_fillAdvancedInfo() {
		// Expedia remembers last settings, if you have previously visited the page clicked advanced options
		// Then next time, when automation runs that option will already be open
		// And automation will click it and this time it will close
		// And the test will faill because it will not be able to find not-stop and flight class checkboxes
		// We are adding If condition to find whether the advanced option is open or close
		WebElement e = driver.findElement(By.id("advanced-options"));
		String clicked = e.getAttribute("aria-pressed");
		System.out.println("Value of area-pressed is: " + clicked);
		if (clicked.contains("false")) {
			SearchPage.clickOnAdvancedLink(driver);
		}
		SearchPage.clickNonStopCheckBox(driver);
		SearchPage.selectFlightClass(driver, "first");
		SearchPage.clickOnSearchButton(driver);
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}
