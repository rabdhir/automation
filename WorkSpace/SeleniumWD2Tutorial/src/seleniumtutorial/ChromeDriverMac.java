package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMac {

	public static void main(String[] args) {
		
		//https://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\WorkSpace\\SeleniumWD2Tutorial\\libs\\chromedriver");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
	}

}
