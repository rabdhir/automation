package usefulmethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeDemo {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		
		//Maximize browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.id("name"));
		
		String classValue = element.getAttribute("class");
		System.out.println("Value of class attribute is: " + classValue);
		
		String typeValue = element.getAttribute("type");	
		System.out.println("Value of type attribute is: " + typeValue);
		
		String placeHValue = element.getAttribute("placeholder");	
		System.out.println("Value of placeholder attribute is: " + placeHValue);
		
		String nameValue = element.getAttribute("name");	
		System.out.println("Value of name attribute is: " + nameValue);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
