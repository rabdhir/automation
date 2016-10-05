package technogeek.co;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		String baseURL = "http://techno-geek.co.uk/";
		
		driver.get(baseURL);
		String myTitle = driver.getTitle();
		
		System.out.println(myTitle);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.xpath("//*[@id='uh-signin']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath(".//*[@id='login-username']")).click();
		
	}

}
