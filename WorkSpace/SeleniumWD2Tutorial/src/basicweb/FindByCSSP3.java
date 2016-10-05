package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByCSSP3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		
		String baseURL = "http://demostore.x-cart.com/apple-iphone-6-16gb.html";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		// "#" - id and "." - class
		
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector(".btn.regular-button.regular-main-button.add2cart.submit")).click();
		driver.findElement(By.cssSelector(".btn.add2cart.submit")).click();
		
		
	}

}

/*
 * 
Exception in thread "main" org.openqa.selenium.WebDriverException: Element is not clickable at point (791.13330078125, 20). Other element would receive the click: <div class="right-panel"></div>
Command duration or timeout: 301 milliseconds
*/