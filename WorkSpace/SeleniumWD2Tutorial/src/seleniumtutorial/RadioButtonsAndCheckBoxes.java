package seleniumtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@Test
public class RadioButtonsAndCheckBoxes {
	WebDriver driver;
	String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		//baseUrl = "https://letskodeit.teachable.com/pages/practice";
		baseUrl = "https://www.expedia.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	/*
	@Test
	public void testRadioButtonsAndCheckBoxes() throws Exception {
		boolean checked = false;
		
		List<WebElement> radioButtons = driver.findElements(By.name("flight-type"));
		for (int i=0; i < radioButtons.size(); i++) {
			checked = radioButtons.get(i).isSelected();
			
			if (checked) {
				radioButtons.get(i+1).click();
				Thread.sleep(2000);
				break;
			}
		}
		driver.findElement(By.id("advanced-options")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("advanced-flight-nonstop-label")).click();
		
	}
	*/
	
	@Test
	public void test() throws InterruptedException {
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		
		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		System.out.println("BMW Radio Button is Selected ?" + bmwRadioBtn.isSelected());
		System.out.println("BMW Radio Button is Selected ?" + benzRadioBtn.isSelected());
		System.out.println("BMW Radio Button is Selected ?" + bmwCheckBox.isSelected());
		System.out.println("BMW Radio Button is Selected ?" + bmwCheckBox.isSelected());
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}
