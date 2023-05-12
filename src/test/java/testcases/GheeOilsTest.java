package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GheeOils;

public class GheeOilsTest {
	
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
	public void popularitySortTest(){
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.popularitySort();
	}
	
	@Test(priority=3)
	public void lowToHighSortTest(){
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.lowToHighSort();
	}
	
	@Test(priority=4)
	public void highToLowSortTest(){
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.highToLowSort();
	}
	
	@Test(priority=5)
	public void discountSortTest(){
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		gheeOils.discountSort();
	}
	
	
	

}
