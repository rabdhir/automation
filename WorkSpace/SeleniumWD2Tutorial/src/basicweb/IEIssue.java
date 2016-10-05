package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEIssue {
	
	// Even if you have windoss 64-bit version, please download IEDriverServer 32-bit version
	// Use Desired Capabilities class to set IE properties
	// All protected zones setting should be the same (Disabled/ Enabled)

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String baseURL = "https://letskodeit.teachable.com/pages/practice";
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver","C:\\automation\\WorkSpace\\SeleniumWD2Tutorial\\libs\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(caps);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
