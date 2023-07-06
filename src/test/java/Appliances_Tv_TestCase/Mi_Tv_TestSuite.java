package Appliances_Tv_TestCase;

import Nandakishore_Project.Flipkart.Flipkart_BaseClass;
import Nandakishore_Project.Flipkart.Flipkart_Tv_POM;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

import static Nandakishore_Project.Flipkart.Flipkart_BaseClass.*;

public class Mi_Tv_TestSuite {
    Flipkart_Tv_POM Tv;
    Flipkart_BaseClass bs;
    int i = 0;

    @BeforeTest
    public void Verify_FlipkartLandingPage() throws Exception {
        openBrowser("chrome", "https://www.flipkart.com/?=iqoo");
        takeScreenshot("FlipKart Launch");
        Tv = new Flipkart_Tv_POM(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Flipkart_BaseClass.LoinPopup();
        takeScreenshot("ClosedLoginPopup");
        //logger.info ("LoginPopup closed successfully ");


    }

    @Test(priority = 0)
    public void Verify_Appliances_Category() throws Exception {
     Tv.ValidateAppliancesCategory();
     takeScreenshot("AppliancesCategory");

    }
    @Test(priority = 1)
    public void Verify_Four_k_Tv_Category() throws Exception {
        Tv.ValidateFour_k_Tv();
        takeScreenshot("Four_k_Tv_Category");
    }
    @Test(priority = 2)
    public void Verify_55k_SmartTv() throws Exception {

        Tv.ValidateMi_55k_SmartTV();
        takeScreenshot("55k_SmartTv");
    }
    @Test(priority = 3)
    public void Verify_ProductTailImages() throws Exception {
        Tv.Validate_All_ProductTailImages();
        takeScreenshot("ProductTailImages");
    }
    @Test(priority = 4)
    public void Verify_ValidPinCode() throws Exception {
        Tv.ValidateValidPinCode();
        takeScreenshot("ValidPinCode");
    }

    @Test(priority = 5)
    public void Verify_AddingMoreProduct() throws Exception {
        Tv.ValidateAddToCart();
        Tv.ValidateAddingMoreProduct();
        takeScreenshot("AddingMoreProduct");

    }
    @Test(priority = 6)
    public void Verify_PlaceToOrder() throws Exception {
        Tv.ValidatePlaceToOrder();
        takeScreenshot("PlaceToOrder");
    }
        @AfterTest

        public void testEnd (ITestResult result) throws Exception {
        i = i + 1;
        String screenshotName = "Login fail";
        String x = screenshotName + String.valueOf(i);
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(screenshotName);

        }
        closeBrowser();
    }

    }
