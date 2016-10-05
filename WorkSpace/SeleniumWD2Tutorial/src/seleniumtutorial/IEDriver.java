package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {
	
public static void main(String[] args) {
		
		//https://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		//by having the location in environment path, you don't need to do System.setProperty
		System.setProperty("webdriver.ie.driver","C:\\automation\\WorkSpace\\SeleniumWD2Tutorial\\libs\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get(baseURL);
		driver.quit();
	}

}
