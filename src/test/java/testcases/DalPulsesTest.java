package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import library.BaseClass;
import pages.DalPulses;

public class DalPulsesTest extends BaseClass {

	DalPulses dalpulses;

	// SoftAssert softassert = new SoftAssert();
	public DalPulsesTest() {

	}

	@BeforeClass
	public void setUp() {
		dalpulses = new DalPulses();
	}

	@Test(priority = 1)
	public void searchBarElementsTest() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String result = dalpulses.searchBarElements();
		System.out.println("Result " + result);

	}

	@Test(priority = 2)
	public void clickOnSearchIconTest() {
		dalpulses.clickOnSearchIcon();

	}

	@Test(priority = 3)
	public void verifySearchElementPageTest() {
		String searchElementTitle = dalpulses.verifySearchElementPage();
		Assert.assertEquals(searchElementTitle,
				"Toordal- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	}

	//@Test(priority = 4)
	//public void searchAutoSuggestedElement() {
		//try {
			//Thread.sleep(10000);
		//} catch (Exception e) {
			//e.printStackTrace();
		//}

		//dalpulses.selectAutoDropDowmElement();
	//}

	@Test(priority = 5)
	public void clickableProductTest() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		dalpulses.clickableProduct();
		tabHandles();
	}

	@Test(priority = 6)
	public void navigateToPDPTest() {
		String productPageTitle = dalpulses.navigateToPDP();
		System.out.println(productPageTitle);
		Assert.assertEquals(productPageTitle,
				"safe harvest Toor/Arhar Dal (Pesticide Free) Price in India - Buy safe harvest Toor/Arhar Dal (Pesticide Free) online at Flipkart.com");
	}

	@Test(priority = 7)
	public void addItemTest() {
		scrollBy();
		scrollBy();
		scrollBy();
		scrollBy();
		

		dalpulses.addItem();
	}

	@Test(priority = 8)
	public void addQuantityTest() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dalpulses.addQuantity();
		dalpulses.addQuantity();

	}

	@Test(priority = 9)
	public void cart() {
		dalpulses.cart();
	}
	
	@Test(priority = 10)
	public void addQuantity1Test() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dalpulses.addQuantity1();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dalpulses.addQuantity1();
		

	}
	
	@Test(priority=11)
	public void placeOrderTest(){
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		dalpulses.productPlaceOrder();
		driver.navigate().back();
		
	}
	
	
	
	@Test(priority=13)
	public void removeProductTest(){
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dalpulses.removeProduct();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dalpulses.removeProduct();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dalpulses.removeProduct();
		driver.navigate().back();
		switchTOParentWindow();
	}

}

