import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebMath {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.getCurrentUrl();
		driver.quit();
	}	
	
	public static void main(String[] args) throws Exception {
		WebMath wm = new WebMath();
		wm.setUp();
		
	}
}
	
