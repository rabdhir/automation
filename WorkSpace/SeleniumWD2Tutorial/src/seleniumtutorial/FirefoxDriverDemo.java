package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {
// PLEASE CHANGE THE EXTENSION TO .java FROM .txt BEFORE RUNNING THE FILE
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "https://www.google.com";
		
		driver.get(baseURL);
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}

