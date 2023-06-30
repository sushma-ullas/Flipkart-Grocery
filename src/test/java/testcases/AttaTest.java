package testcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.BaseClass;
import pages.Atta;

public class AttaTest extends BaseClass {
	Atta atta;

	public AttaTest() {

	}

	@BeforeClass
	public void setUp() {
		atta = new Atta();
	}

	@Test(priority = 1)
	public void filterBrandTest() throws Exception {
		String currentPage = driver.getCurrentUrl();
		System.out.println(currentPage);
		scrollBy();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// new WebDriverWait(getWebDriver(),
		// 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Brand']"))).click();
		atta.filterBrand();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/filter.png");
		scrollBy();
	}

	@Test(priority = 2)
	public void availabilityTest() throws Exception {

		atta.availability();
		atta.includeOutOfStock();
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/outofstockfilter.png");
		scrollBy();
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/outofstockfilter1.png");

	}

	@Test(priority = 3)
	public void backToGroceryTest() throws Exception {
		atta.backToGrocery();
		takeSnapShot(driver,
				System.getProperty("user.dir") +  "/screenShots/backtogrocery.png");
	}

}
