package switchto;

// When working with Javascript alert

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchAlert {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Rahmat");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Rahmat");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		alert.dismiss();
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
