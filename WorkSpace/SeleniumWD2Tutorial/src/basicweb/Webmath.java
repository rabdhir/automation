package basicweb;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Webmath {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://webmath.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testWebmath() throws Exception {
		driver.get(baseUrl + "/");
		new Select(driver.findElement(By.id("topicItem"))).selectByVisibleText("Interest, Simple");
		// ERROR: Caught exception [Error: locator strategy either id or name
		// must be specified explicitly.]
		driver.findElement(By.name("principal")).clear();
		driver.findElement(By.name("principal")).sendKeys("20000");
		driver.findElement(By.name("interest")).clear();
		driver.findElement(By.name("interest")).sendKeys("0.9");
		driver.findElement(By.name("desired_time")).clear();
		driver.findElement(By.name("desired_time")).sendKeys("5");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
