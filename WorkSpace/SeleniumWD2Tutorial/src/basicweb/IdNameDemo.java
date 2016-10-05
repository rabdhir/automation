package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdNameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		// input[@id='lst-ib']']
		// driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("letskodeit");

		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(10000);
		driver.quit();
	}

}
