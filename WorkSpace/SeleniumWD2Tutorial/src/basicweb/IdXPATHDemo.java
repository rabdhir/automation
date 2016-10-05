package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// finding elements by ID and XPath
public class IdXPATHDemo {

	public static void main(String[] args) throws InterruptedException {
		// lst-ib
		
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
		
		//Thread.sleep(4000);
		//driver.quit();
	}

}
