package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// this is not widely used.
public class FindByTagName {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		
		String baseURL = "http://www.x-cart.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.tagName("a")).click();
		
		// interview questions
		// id - fastest
		// name 
		// classname
		// xpath
		// linktext
		// partial link text
		// tagname
		// css selector

	}

}
