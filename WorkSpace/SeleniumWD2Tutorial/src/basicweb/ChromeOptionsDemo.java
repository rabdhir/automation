package basicweb;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", 
				"C:\\automation\\WorkSpace\\SeleniumWD2Tutorial\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\rahma\\AppData\\Local\\Google\\"
				+ "Chrome\\User Data\\Default\\Extensions\\aapocclcgogkmnckokdopfmhonfmgoek/0.9_0.crx"));
		
		driver = new ChromeDriver(options);
		driver.get(baseURL);
	}
}

