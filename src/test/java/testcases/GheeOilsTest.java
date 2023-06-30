package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.BaseClass;
import pages.GheeOils;

public class GheeOilsTest extends BaseClass {
	
	GheeOils gheeOils;
	
	public GheeOilsTest() {

	}

	@BeforeClass
	public void setUp() {
		gheeOils = new GheeOils();
	}
	
	@Test(priority=1)
	public void mouseOverTest(){
		gheeOils.mouseOver();
	}
	
	@Test(priority=2)
	public void popularitySortTest() throws Exception{
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.popularitySort();
		takeSnapShot(driver, System.getProperty("user.dir") +  "/screenShots/popularity.png") ;
	}
	
	@Test(priority=3)
	public void lowToHighSortTest() throws Exception{
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.lowToHighSort();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		takeSnapShot(driver, System.getProperty("user.dir") +  "/screenShots/lowtohigh.png") ;
	}
	
	@Test(priority=4)
	public void highToLowSortTest() throws Exception{
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.highToLowSort();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		takeSnapShot(driver, System.getProperty("user.dir") +  "/screenShots/hightolow.png") ;
	}
	
	@Test(priority=5)
	public void discountSortTest() throws Exception{
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.discountSort();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		takeSnapShot(driver, System.getProperty("user.dir") +  "/screenShots/discount.png") ;
	}
	
	
	
	
	
	

}
