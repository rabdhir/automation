package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.SearchPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab")).click();
		Thread.sleep(5000);
		SearchPage.fillOriginTextBox(driver, "New York");
		SearchPage.destinationTextBox(driver).sendKeys("Chicago");
		SearchPage.departureDateTextBox(driver).sendKeys("10/14/2016");
		// Added a line to clear the return date text box
		// before entering the return date, because Expedia by default
		// enters the return date same as the departure date
		SearchPage.returnDateTextBox(driver).clear();
		SearchPage.returnDateTextBox(driver).sendKeys("10/20/2016");
		SearchPage.clickOnSearchButton(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
}
