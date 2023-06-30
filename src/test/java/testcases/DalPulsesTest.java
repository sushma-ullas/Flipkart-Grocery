package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		String result = dalpulses.searchBarElements();
		System.out.println("Result " + result);

	}

	@Test(priority = 2)
	public void clickOnSearchIconTest() {
		dalpulses.clickOnSearchIcon();

	}

	@Test(priority = 3)
	public void verifySearchElementPageTest() throws Exception {
		String searchElementTitle = dalpulses.verifySearchElementPage();
		Assert.assertEquals(searchElementTitle,
				"Toordal- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/search.png");
	}

	// @Test(priority = 4)
	// public void searchAutoSuggestedElement() {
	// try {
	// Thread.sleep(10000);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }

	// dalpulses.selectAutoDropDowmElement();
	// }

	@Test(priority = 5)
	public void clickableProductTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        dalpulses.clickableProduct();
		tabHandles();
	}

	@Test(priority = 6)
	public void navigateToPDPTest() throws Exception {
		String productPageTitle = dalpulses.navigateToPDP();
		System.out.println(productPageTitle);
		Assert.assertEquals(productPageTitle,
				"Dehaat Honest Farms Toor/Arhar Dal (Split) Price in India - Buy Dehaat Honest Farms Toor/Arhar Dal (Split) online at Flipkart.com:");
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/product.png");
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
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		dalpulses.addQuantity1();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		dalpulses.addQuantity1();

	}

	@Test(priority = 11)
	public void placeOrderTest() throws Exception {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/cart.png");

		dalpulses.productPlaceOrder();

		driver.navigate().back();
	}

	// @Test(priority=12)
	// public void emailTest() {
	// dalpulses.emailLogin();

	// }

	// @Test(priority=13)
	// public void loginPromptTest() {

	// try {
	// Thread.sleep(1000);
	// dalpulses.loginPrompt();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// @Test(priority=14)
	// public void loginSubmitTest() {

	// try {
	// Thread.sleep(30000);
	// dalpulses.loginSubmit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	@Test(priority = 14)
	public void removeProductTest() throws Exception {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		dalpulses.removeProduct();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		dalpulses.removeProduct();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		dalpulses.removeProduct();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/emptybasket.png");

		driver.navigate().back();
		switchTOParentWindow();
	}

}
