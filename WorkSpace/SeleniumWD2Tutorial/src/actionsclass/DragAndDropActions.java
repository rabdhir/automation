package actionsclass;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://jqueryui.com/droppable/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testDragAndDrop() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(3000);
		driver.switchTo().frame(0);  // iframe
		
		WebElement fromElement = driver.findElement(By.id("draggable"));
		WebElement toElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		// Drag and drop
		// action.dragAndDrop(fromElement, toElement).build().perform();
		
		// Click and hold, move to element, release, build and perform
		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
