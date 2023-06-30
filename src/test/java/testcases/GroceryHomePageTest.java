package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.BaseClass;
import pages.GroceryHomePage;

public class GroceryHomePageTest extends BaseClass {

	GroceryHomePage homePage;

	public GroceryHomePageTest() {

	}

	@BeforeClass
	public void setUp() {
		WebDriver driver = getDriver();
		homePage = new GroceryHomePage(driver);
	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest() {

		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}

	@Test(priority = 2)
	public void verifyGroceryOnHomePage() {

		Assert.assertTrue(homePage.verifyGroceryOnHomePage());
	}

	@Test(priority = 3)
	public void clickOnGroceryTest() throws Exception {
		homePage.clickonGrocery();
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/grocery.png");
		
	
	}

	@Test(priority = 4)
	public void enterLocationPinCode() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.sendPinCode();
	}

	@Test(priority = 5)
	public void submitLocation() throws Exception {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.submitLocation();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/groceryhomepage.png");
	}

	@Test(priority = 6)
	public void loginTest() throws Exception {
		homePage.login();
		try {
			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.mobileNumber();

		try {
			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.requestOTP();
		System.out.println(" current path " + System.getProperty("user.dir"));
		//takeSnapShot(driver,
			//	System.getProperty("user.dir") +  "/screenShots/grocerypage2.png");

	}

	@Test(priority = 7)
	public void closeTest() throws Exception {
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/loginpage.png");

		try {
			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.close();

	}

}
