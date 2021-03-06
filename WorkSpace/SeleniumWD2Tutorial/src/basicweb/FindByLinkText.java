package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		// String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		// driver.get(baseURL);
		
		//driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(3000);
		
		String newURL = "http://demostore.x-cart.com";
		driver.get(newURL);
		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(3000);
		//findElement by partialLink also works
		driver.findElement(By.partialLinkText("Contact")).click();
		driver.quit();
		
	}

}
