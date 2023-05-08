package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Grocery']")
	WebElement Grocery;
	
	
	public void clickonGrocery(){
		Grocery.click();
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyGroceryOnHomePage(){
		return Grocery.isDisplayed();
		
	}

}