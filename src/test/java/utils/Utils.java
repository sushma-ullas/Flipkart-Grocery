package utils;

import org.openqa.selenium.JavascriptExecutor;

import library.BaseClass;

public class Utils extends BaseClass {
	
	
	public static void scrollBy(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

}
