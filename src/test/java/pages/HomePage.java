package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.BaseClass;


public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Grocery']")
	WebElement Grocery;
	
	@FindBy(xpath="//input[@placeholder='Enter pincode']")
	WebElement LocationPinCode;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement LocationSubmit;
	
	@FindBy(xpath="//input[@placeholder='Search grocery products']")
	WebElement SearchGroceries;
	
	@FindBy(xpath="//button[@type='submit']//*[name()='svg']")
	WebElement SearchIcon;
	
	@FindBy(xpath="//div[@class='_1MR4o5']")
	WebElement suggestedElement;
	
	@FindBy(xpath="//div[@class='_1MbXnE'][normalize-space()='safe harvest Toor/Arhar Dal (Pesticide Free)']")
	WebElement product;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww _27Cjkl']")
	WebElement addItem;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement addQuantity;
	
	@FindBy(xpath="//span[normalize-space()='Cart']")
	WebElement cart;
	
	@FindBy(xpath = "//*[contains(text(), 'Login')]")
	WebElement login;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement sendMobile;
	
//	@FindBy(xpath = "//button[@type='submit']")
//	WebElement loginContinue;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement requestOtp;
	
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh _17N0em']")
	WebElement otp;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitLogin;
	
	public void cart(){
		cart.click();
	}
	
	public void addQuantity(){
		addQuantity.click();
	}
	
		
	public void addItem(){
	
		
		addItem.click();
	}
	
	
	
	public void clickableProduct(){
		product.click();
	}
	
	public String navigateToPDP(){
		return driver.getTitle();
	}
	
	public void selectAutoDropDowmElement(){
		SearchGroceries.click();
		SearchGroceries.sendKeys(Keys.ARROW_DOWN);
		suggestedElement.click();
		SearchGroceries.sendKeys(Keys.ENTER);
		
	}
	
	public void clearSearchBar(){
		SearchGroceries.clear();
		
	}
	
	
	public void searchBarElements(){
		
		
		SearchGroceries.sendKeys("ToorDal");
		
		
	}
	
	public void clickOnSearchIcon(){
		SearchIcon.click();
		
	}
	
	public String verifySearchElementPage(){
		return driver.getTitle();
	}
	
	
	
	
	public void clickonGrocery(){
		Grocery.click();
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyGroceryOnHomePage(){
		return Grocery.isDisplayed();
	}

	public void sendPinCode(){
		LocationPinCode.sendKeys(new String[]{"560001"});
	}
	
	public void submitLocation(){
		LocationSubmit.submit();
	}
	
	public void login(){
		login.click();
		
	}
	public void sendMobile(){
		sendMobile.sendKeys("9448776300");
		
	}
	
	public void requestOtp(){
		requestOtp.click();
		
	}
	
	
//	public void loginContinue(){
//		loginContinue.click();
//	}
	
	public void otp(){
		
	}
	
	public void submitLogin(){
		submitLogin.click();
	}
	
}