package actionsclass;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	private WebDriver driver;
	private String baseUrl;
	JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		jse = (JavascriptExecutor)driver;
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testMouseHoverActions() throws InterruptedException {
		driver.get(baseUrl);
		// I have to adjust window scroll by 700 to avoid error element not visible
		// previously had it set to 600
		jse.executeScript("window.scrollBy(0, 800)");
		Thread.sleep(4000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(3000);
		
		// 'Top' will bring the page to the top
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		action.moveToElement(subElement).click().perform();
		
	}
/*
	@Test
	public void testMouseHoverActions2() throws InterruptedException {
		driver.get(baseUrl);
		// I have to adjust window scroll by 700 to avoid error element not visible
		// previously had it set to 600
		jse.executeScript("window.scrollBy(0, 800)");
		Thread.sleep(4000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(3000);
		
		WebElement nextElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Reload']"));
		action.moveToElement(nextElement).click().perform();
	}
*/
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
