package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.BaseClass;

public class Atta extends BaseClass{
	public Atta() {
		PageFactory.initElements(getDriver(), this);
	}
	//@FindBy(xpath="//div[text()='Brand']")
	@FindBy(xpath="//input[@placeholder='Search Brand']")
	WebElement brand;
	
	@FindBy(xpath="//span[text()='41 MORE']")
	WebElement moreOption;
	
	@FindBy(xpath="//div[text()='AASHIRVAAD']")
	WebElement aashirvaad;
	
	@FindBy(xpath="//div[text()='Bertolli']")
	WebElement bertolli;
	
	@FindBy(xpath="//div[text()='Gemini']")
	WebElement gemini;
	
	@FindBy(xpath="//span[text()='Apply Filters']")
	WebElement applyFilters;
	
	@FindBy(xpath="//div[text()='4★ & above']")
	WebElement customerRatings;
	
	@FindBy(xpath="//div[text()='Availability']")
	WebElement availability;
	
	@FindBy(xpath="//div[text()='Include Out of Stock']")
	WebElement includeOutOfStock;
	
	@FindBy(xpath="//img[@class='_2xm1JU']")
	WebElement backTOGroceryPage;
	
	
	
	
	
	
	
	public void filterBrand() throws Exception {
		brand.sendKeys("Aashirvaad");
		//moreOption.click();
		aashirvaad.click();
		//bertolli.click();
		//gemini.click();
		//applyFilters.click();
		
		
	}
	
	public void availability() {
		availability.click();
	}
	
	public void filterCustomerRating() {
		customerRatings.click();
	}
	
	public void includeOutOfStock () {
		includeOutOfStock.click();
		
	}
	
	public void backToGrocery() {
		backTOGroceryPage.click();
	}
	
	
	
	
	
	
	
	

}
