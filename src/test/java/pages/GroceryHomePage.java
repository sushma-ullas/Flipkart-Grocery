package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.BaseClass;

public class GroceryHomePage {

	WebDriver driver;

	public GroceryHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Grocery']")
	WebElement Grocery;

	@FindBy(xpath = "//input[@placeholder='Enter pincode']")
	WebElement LocationPinCode;

	@FindBy(xpath = "//button[@type='button']")
	WebElement LocationSubmit;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement login;

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement mobileNumber;

	@FindBy(xpath = "//button[text()='Request OTP']")
	WebElement requestOTP;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement close;

	@FindBy(xpath = "//div[text()='Include Out of Stock']")
	WebElement includeOutOfStock;

	public void clickonGrocery() {
		Grocery.click();
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyGroceryOnHomePage() {
		return Grocery.isDisplayed();
	}

	public void sendPinCode() {
		LocationPinCode.sendKeys(new String[] { "560099" });
	}

	public void submitLocation() {
		LocationSubmit.submit();
	}

	public void login() {
		login.click();
	}

	public void mobileNumber() {
		mobileNumber.sendKeys("9448776300");
	}

	public void requestOTP() {
		requestOTP.click();
	}

	public void close() {
		close.click();
	}
}