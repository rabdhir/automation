package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXPATHDemo {

	public static void main(String[] args) {
		//input[@id='lst-ib']
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "https://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		//div[@id='sblsbb']/button
		driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
		
		

	}

}
