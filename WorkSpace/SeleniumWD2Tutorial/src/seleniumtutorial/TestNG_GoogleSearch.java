package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_GoogleSearch {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger(TestNG_GoogleSearch.class);

	@BeforeClass
	public void beforeClass() {
		PropertyConfigurator.configure("log4j.properties");
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	} 

/*
 * Note that google search with id="gs_htif0" wouldn't work because it was disabled, so
 * we have to use other id. It took me several hours to figure this out
 * 9/2/2016
 */
	//@Test(threadPoolSize=3, invocationCount=3)
	@Test
	public void searchText() throws Exception {
		log.info("[START] Thread Id : " + 
                Thread.currentThread().getId() + " is started!");
		driver.findElement(By.id("lst-ib")).sendKeys(
				"Java MultiThreading");
		log.info("Element found and search for Java MultiThreading");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
		log.info("[END] Thread Id : " +
                Thread.currentThread().getId() + " is ended");
	}
}
