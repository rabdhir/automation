package technogeek.co;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterPageDemo {

	WebDriver driver;
	String baseUrl = "http://techno-geek.co.uk/";
	JavascriptExecutor jse = (JavascriptExecutor)driver;
  
  @BeforeTest
  public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @Test
  public void testRegisterPage() throws InterruptedException {
	  driver.get(baseUrl);
	  driver.findElement(By.xpath("//div//a[text()='Register']")).click();
	  Thread.sleep(3000);
	  jse.executeScript("window.scrollBy(0, 500)", "");
	  
	  
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
