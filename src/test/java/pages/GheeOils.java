package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.BaseClass;

public class GheeOils extends BaseClass {

	public GheeOils() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//div[contains(text(),'Staples')]")
	WebElement moveOver;

	@FindBy(xpath = " //a[contains(text(),'Ghee & Oils')]")
	WebElement gheeOils;

	@FindBy(xpath = "//div[normalize-space()='Popularity']")
	WebElement popularity;

	@FindBy(xpath = "//div[normalize-space()='Price -- Low to High']")
	WebElement lowToHigh;

	@FindBy(xpath = "//div[normalize-space()='Price -- High to Low']")
	WebElement highToLow;

	@FindBy(xpath = "//div[@class='_10UF8M'][normalize-space()='Discount']")
	WebElement discount;

	public void mouseOver() {
		Actions action = new Actions(driver);
		action.moveToElement(moveOver).perform();
		action.moveToElement(gheeOils).click(gheeOils).build().perform();
	}

	public void popularitySort() {
		popularity.click();

	}
	public void lowToHighSort(){
		lowToHigh.click();
	}
	public void highToLowSort(){
		highToLow.click();
	}
	public void discountSort(){
		discount.click();
	}

}
