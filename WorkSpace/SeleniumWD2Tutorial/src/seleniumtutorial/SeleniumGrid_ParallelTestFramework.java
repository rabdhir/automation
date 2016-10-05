package seleniumtutorial;

import org.testng.annotations.Test;

import page.classes.TestSuiteBase;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SeleniumGrid_ParallelTestFramework extends TestSuiteBase {
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
	}

	@Test
	public void searchFlights() throws Exception {
		search.clickFlightsTab();
		search.setOriginCity("New York");
		search.setDestinationCity("San Francisco");
		search.setDepartureDate("10/28/2015");
		search.setReturnDate("10/31/2015");
	}

	@AfterClass
	public void tearDown() throws Exception {
	}
  
}
