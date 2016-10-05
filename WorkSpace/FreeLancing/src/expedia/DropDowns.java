package expedia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		baseUrl1 = "https://www.expedia.com";
		baseUrl2 = "http://html.com/attributes/select-multiple/";
	}
	
	//@Test
	public void testDropDown() throws InterruptedException {
		driver.get(baseUrl1);
		driver.findElement(By.xpath(".//*[@id='tab-flight-tab']/span[1]")).click();
		Thread.sleep(3000);
		
		Select sel1 = new Select(driver.findElement(By.id("flight-adults")));
		Select sel2 = new Select(driver.findElement(By.id("flight-children")));
		
		List<WebElement> options = sel1.getOptions();
		int size = options.size();
		
		for (int i=0; i < size; i++) {
			String optionName = sel1.getOptions().get(i).getText();
			System.out.println(optionName);
		}
		
		// By Value
		sel1.selectByValue("2");
		
		// By Index
		sel2.selectByIndex(2);
	}
	
	@Test
	public void testMultiSelect() throws Exception {
		driver.get(baseUrl2);
		//jse.executeScript("window.scrollBy(0,650)", "");
		Select sel = new Select(driver.findElement(
				By.xpath("//*[@id='wrapper']/article/section/div[3]/select")));
		
		Thread.sleep(2000);
		sel.selectByValue("Andean");
		Thread.sleep(2000);
		sel.deselectByValue("Andean");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("Lesser");
		Thread.sleep(2000);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.deselectAll();
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}
}
