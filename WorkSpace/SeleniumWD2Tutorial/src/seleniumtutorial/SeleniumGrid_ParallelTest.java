package seleniumtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import page.classes.SearchPageFactoryGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class SeleniumGrid_ParallelTest {
	private WebDriver driver;
	private String baseUrl;
	private String nodeURL;
	
	SearchPageFactoryGrid searchPage;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.expedia.com/";
		nodeURL = "http://192.168.1.67:5555/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), caps);
		
		searchPage = new SearchPageFactoryGrid(driver);
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void searchFlights() throws Exception {
		searchPage.clickFlightsTab();
		searchPage.clearAllFields();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
		searchPage.setDepartureDate("9/28/2016");
		searchPage.setReturnDate("10/12/2016");
	}

	@AfterMethod
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
}
