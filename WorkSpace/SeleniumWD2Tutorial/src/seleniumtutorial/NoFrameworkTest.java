package seleniumtutorial;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Please change the extension to .java before using the file
//I changed the extension to .txt because udemy does not allow to upload .java files
public class NoFrameworkTest {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() {
		driver.findElement(By.id("header-history")).click(); // this to avoid the pop ups
		driver.findElement(By.id("tab-flight-tab")).click();
		driver.findElement(By.id("flight-origin")).sendKeys("New York");
		driver.findElement(By.id("flight-destination")).sendKeys("Chicago");
		driver.findElement(By.id("flight-departing")).sendKeys("10/28/2016");
		driver.findElement(By.id("flight-returning")).sendKeys("10/31/2016");
		driver.findElement(By.id("search-button")).click();
	}

	@After
	public void afterClass() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}
