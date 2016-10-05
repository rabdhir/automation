package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import page.classes.SearchPage;

public class TestNG_MultiBrowserAndParallelTests {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_DependentTests.class);

	@Parameters("browserType")
	@BeforeClass
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} 
		else if (browser.equalsIgnoreCase("chrome")) {
			// http://chromedriver.storage.googleapis.com/index.html
			System.setProperty("webdriver.chrome.driver", 
					"C:\\automation\\WorkSpace\\SeleniumWD2Tutorial\\libs\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		baseUrl = "https://www.expedia.com/";
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void searchFlights() throws Exception {
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.clearAllFields(driver);
		Thread.sleep(3000);
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.fillDestinationTextBox(driver, "Chicago");
		SearchPage.fillDepartureDateTextBox(driver, "10/12/2016");
		SearchPage.fillReturnDateTextBox(driver, "10/31/2016");
		SearchPage.selectFlightAdults(driver, "3");
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
