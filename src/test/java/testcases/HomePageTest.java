package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass {

	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		homePage = new HomePage();
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
	
	@Test(priority=3)
	public void clickOnGroceryTest(){
		homePage.clickonGrocery();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	

}
