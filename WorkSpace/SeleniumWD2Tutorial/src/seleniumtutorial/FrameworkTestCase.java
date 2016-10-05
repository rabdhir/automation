package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPageFactory;

public class FrameworkTestCase {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;

	@Before
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new SearchPageFactory(driver);
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws Exception {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
		searchPage.setDepartureDate("9/28/2016");
		searchPage.setReturnDate("10/12/2016");
		driver.findElement(By.id("search-button")).click(); // ??
		
	}
	
	@After
	public void afterClass() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
