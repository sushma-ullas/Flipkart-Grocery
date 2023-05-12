package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.BaseClass;
import pages.HomePage;

public class AHomePageTest extends BaseClass  {

	HomePage homePage;

	public AHomePageTest() {
		
	}

	@BeforeClass
	public void setUp() {
		WebDriver driver = getDriver();
		homePage = new HomePage(driver);
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
	
	
	@Test(priority=4)
	public void enterLocationPinCode(){
		try {
			Thread.sleep(7000);	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		homePage.sendPinCode();
	}
	
	@Test(priority=5)
	public void submitLocation(){
		try {
			Thread.sleep(5000);	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		homePage.submitLocation();
		try {
			Thread.sleep(20000);	
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
//	@Test(priority=6)
//	public void searchBarElementsTest(){
//		try {
//			Thread.sleep(10000);	
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		homePage.searchBarElements();
//	    
//		
//	}
//	@Test(priority=7)
//	public void clickOnSearchIconTest(){
//		homePage.clickOnSearchIcon();
//		
//		
//	}
//	@Test(priority=8)
//	public void clearSearchBarTest(){
//          homePage.clearSearchBar();
//          
//	}
//	
//	@Test(priority=9)
//	public void verifySearchElementPageTest(){
//		String searchElementTitle = homePage.verifySearchElementPage();
//		Assert.assertEquals(searchElementTitle, "Toordal- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
//	}
//	
//	//@Test(priority=9)
//	//public void searchAutoSuggestedElement(){
//		//try {
//		//	Thread.sleep(10000);	
//		//}
//		//catch(Exception e){
//		//	e.printStackTrace();
//		//}
//		
//		//homePage.selectAutoDropDowmElement();
//	//}
//	
//	@Test(priority=10)
//	public void clickableProductTest(){
//		try {
//			Thread.sleep(10000);	
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		
//		homePage.clickableProduct();
//		tabHandles();
//	}
//	
//	@Test(priority=11)
//	public void navigateToPDPTest(){
//		String productPageTitle = homePage.navigateToPDP();
//		System.out.println(productPageTitle);
//		Assert.assertEquals(productPageTitle, "safe harvest Toor/Arhar Dal (Pesticide Free) Price in India - Buy safe harvest Toor/Arhar Dal (Pesticide Free) online at Flipkart.com");
//	}
//	
//	@Test(priority=12)
//	public void addItemTest(){
//		scrollBy();
//		scrollBy();
//		scrollBy();
//		scrollBy();
//		
//		homePage.addItem();
//	}
//	
//	@Test(priority=13)
//	public void addQuantityTest(){
//		try {
//			Thread.sleep(10000);	
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		homePage.addQuantity();
//		homePage.addQuantity();
//		
//	}
//	@Test(priority=14)
//	public void cart(){
//		homePage.cart();
//	}

	
	

	
	//@Test(priority=5)
	//public void listSize(){
		//try {
			//Thread.sleep(5000);	
		//}
		//catch(Exception e){
			//e.printStackTrace();
		//}
		//homePage.searchBarElements();
		//try {
			//Thread.sleep(5000);	
		//}
		//catch(Exception e){
			//e.printStackTrace();
		//}
	//}
	
	//@AfterClass
	//public void tearDown(){
		//driver.quit();
	//}
	
	

}
