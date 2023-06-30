package pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import library.BaseClass;

public class DalPulses extends BaseClass {
	public DalPulses() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement SearchGroceries;

	@FindBy(xpath = "//button[@type='submit']//*[name()='svg']")
	WebElement SearchIcon;

	@FindBy(xpath = "//div[contains(text(),'oil')]")
	WebElement suggestedElement;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[2]/a")
	WebElement product;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww _27Cjkl']")
	WebElement addItem;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement addQuantity;

	@FindBy(xpath = "//span[normalize-space()='Cart']")
	WebElement cart;

	@FindBy(xpath = "//div[@class='_1AtVbE col-12-12']//div[3]//button[1]")
	WebElement cartAddQuantity;

	@FindBy(xpath = "//span[normalize-space()='Place Order']")
	WebElement placeOrder;
	
	@FindBy(xpath = "//input[@class='_2IX_2- _17N0em']")
	WebElement email;
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh _17N0em']")
	WebElement otp;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _20xBvF _3AWRsL']")
	WebElement loginPrompt;
	
	@FindBy(xpath = "//span[text() = 'Login']")
	WebElement loginButton;

	@FindBy(xpath = "//div[@class='_2WOk5C']//div[1]//button[1]")
	WebElement removeProduct;

	public String searchBarElements() {

		this.SearchGroceries.sendKeys("ToorDal");
		return "success";

	}

	public void clickOnSearchIcon() {
		SearchIcon.click();

	}

	public String verifySearchElementPage() {
		return driver.getTitle();

	}

	public void selectAutoDropDowmElement() {
		SearchGroceries.click();
		SearchGroceries.sendKeys(Keys.ARROW_DOWN);
		suggestedElement.click();

	}

	public void clickableProduct() {
		product.click();
	}

	public String navigateToPDP() {
		return driver.getTitle();
	}

	public void addItem() {

		addItem.click();
	}

	public void addQuantity() {
		addQuantity.click();
	}

	public void cart() {
		cart.click();
	}

	public void addQuantity1() {
		cartAddQuantity.click();

	}

	public void productPlaceOrder() {
		placeOrder.click();
	}
	
	public void emailLogin() {
		email.sendKeys("8861137077");
	}
	
	public void otp() {
		
	}
	
	public void loginPrompt() {
		loginPrompt.click();
	}
	
	public void loginSubmit() {
		loginButton.click();
	}

	public void removeProduct() {
		removeProduct.click();
	}

}
