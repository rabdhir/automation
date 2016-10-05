package page.classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	@FindBy(id="header-history")
	WebElement headerHistory;
	
	// we are on Flights page
	@FindBy(id="tab-flight-tab")
	WebElement flightsTab;
	
//	@FindBy(id="flight-type-roundtrip-label")
//	WebElement roundTrip;
//
//	@FindBy(id="flight-type-one-way-label")
//	WebElement oneWay;
//
//	@FindBy(id="flight-type-multi-dest-label")
//	WebElement multipleDestination;
	
	@FindBy(id="flight-origin")
	WebElement originCity;
	
	@FindBy(id="flight-destination")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing")
	WebElement departureDate;
	
	@FindBy(id="flight-returning")
	WebElement returnDate;
	
	@FindBy(id="search-button")
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		headerHistory.click();
		flightsTab.click();
	}
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setDepartureDate(String departuredate) {
		departureDate.sendKeys(departuredate);
	}
	
	
	public void setReturnDate(String returndate) {
		returnDate.sendKeys(returndate);
		returnDate.sendKeys(Keys.TAB);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
//	public void clickRoundTrip() {
//		roundTrip.click();
//	}
//
//	public void clickOneWay() {
//		oneWay.click();
//	}
//
//	public void clickMultipleDestination() {
//		multipleDestination.click();
//	}
		
}