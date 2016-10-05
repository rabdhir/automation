package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(baseURL);
		//comp-iiqg1vggactionTitle
		WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signupLink.click();
		//signUpDialogswitchDialogLink
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		//memberLoginDialogemail
		//memberLoginDialoginputWithValidation7input
		/*
		 * *** Will not work. WebElement emailField = driver.findElement(
		 * By.id("memberLoginDialoginputWithValidation7input"));
		 */
		WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		emailField.sendKeys("test@email.com");
		//"memberLoginDialoginputWithValidation6input"
		//WebElement passwordField = driver.findElement(By.id("memberLoginDialoginputWithValidation6input"));
		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		passwordField.sendKeys("abcabc");
		//"memberLoginDialogsubmitButton"
		WebElement goButton = driver.findElement(By.id("memberLoginDialogsubmitButton"));
		goButton.click();

// With recent webdriver and FF update, there might be issues in clicking the goButton.
// If you also encouter the issues, please comment the above code for goButton and un-comment the below code
		
//		WebElement goButton =driver.findElement(By.xpath("//button[@id='memberLoginDialogsubmitButton']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(goButton).click().perform();
		
		Thread.sleep(3000);
		//DrpDwnMn06label
		WebElement practicePage = driver.findElement(By.id("DrpDwnMn06label"));
		//WebElement practicePage = driver.findElement(By.id("DrpDwnMn06bg"));
		practicePage.click();
		System.out.println("Login Successful");
	}
}
