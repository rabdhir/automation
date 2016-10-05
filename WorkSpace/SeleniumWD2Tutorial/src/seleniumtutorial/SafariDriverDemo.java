package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new SafariDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
	}

}
