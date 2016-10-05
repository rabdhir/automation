package page.classes;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitTypes;

public class SearchPage {
	public static WebElement element = null;
	static Logger log = Logger.getLogger(SearchPage.class);
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		log.info("Origin text box element found");
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
		log.info("Enter origin city as " + origin);
	}

	/**
	 * Returns the flight destination text box element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		log.info("Destination text box element found");
		return element;
	}

	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.sendKeys(destination);
		log.info("Enter destination city as " + destination);
	}
	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		log.info("Departure text box element found");
		return element;
	}

	public static void fillDepartureDateTextBox(WebDriver driver, String departureDate) {
		element = departureDateTextBox(driver);
		element.sendKeys(departureDate);
		log.info("Enter departure date as " + departureDate);
	}
	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}

	public static void fillReturnDateTextBox(WebDriver driver, String returnDate) {
		element = returnDateTextBox(driver);
		element.clear();  // added 9/1/16 to test reset return date
		element.sendKeys(returnDate);
		log.info("Enter return date as " + returnDate);
	}
	/**
	 * Returns the search button box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}
	/**
	 * Click on Advanced Options link
	 * @param driver
	 */
	public static void clickOnAdvancedLink(WebDriver driver) {
		element = driver.findElement(By.id("advanced-options"));
		element.click();
		log.info("Clicked on Advanced Options link");
	}
	
	/**
	 * Click non-stop check box
	 * @param driver
	 */
	public static void clickNonStopCheckBox(WebDriver driver) {
		element = driver.findElement(By.id("advanced-flight-nonstop"));
		element.click();
		log.info("Clicked non-stop check box");
	}
	/**
	 * Select flight class
	 * @param driver
	 */
	public static void selectFlightClass(WebDriver driver, String flightClass) {
		Select options = new Select(driver.findElement(By.id("flight-advanced-preferred-class")));
		options.selectByValue(flightClass);
		log.info("Select flight class as " + flightClass);
	}

	/**
	 * Click on Morning check box to filter the results
	 * @param driver
	 */
	public static void clickMorningFlight(WebDriver driver) {
		WebElement element = WaitTypes.getWhenVisible(driver, 
				By.xpath("//ul[@id='departureTimeList']//span[contains(text(), 'Morning')]"
						+ "//preceding-sibling::input"), 30);
		element.click();
		log.info("Clicked on Morning Time to filter the results");
	}

	public static void clearAllFields(WebDriver driver) {
		driver.findElement(By.id("flight-origin")).clear();
		driver.findElement(By.id("flight-destination")).clear();
		driver.findElement(By.id("flight-departing")).clear();
		driver.findElement(By.id("flight-returning")).clear();
		
	}

	public static void selectFlightAdults(WebDriver driver, String select) {
		element = driver.findElement(By.id("flight-adults"));
		element.sendKeys(select);
		log.info("Select number of adults for this flight: " + select);
	}
	
}
