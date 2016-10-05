package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) throws InterruptedException {
		
		//https://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\WorkSpace\\SeleniumWD2Tutorial\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		//driver.findElement(By.id(".//*[@id='lst-ib']"));
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
