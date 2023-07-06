package Nandakishore_Project.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class Flipkart_Tv_POM {
    WebDriver driver;
    @FindBy(xpath = "//div[text()='Appliances'] ")
    WebElement Appliances;
    @FindBy(xpath = "(//img[@class='kJjFO0 _3DIhEh'])[3]")
    WebElement Four_K_Tv;
    @FindBy(xpath = "(//div[@class='_1bEAQy _2iN8uD'])[2]")
    WebElement Mi_55k_SmartTV;
    @FindBy(xpath = "//div[@class='_2mLllQ']")
    WebElement ProductTileImages;
    @FindBy(xpath = "//input[@class='_36yFo0']")
    WebElement PinCode;
    @FindBy(xpath = "//span[@class='_2P_LDn']")
    WebElement EnterPinCode;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    WebElement AddToCart;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[2]")
    WebElement AddTwoMoreQuantity;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[1]")
    WebElement RemoveAddedQuantity;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
    WebElement PlaceToOrder;




//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[1]")
//    WebElement ProductTileImagesS;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[2]")
//    WebElement Product2ndTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[3]")
//    WebElement Product3rdTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[4]")
//    WebElement Product4thTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[5]")
//    WebElement Product5thTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[6]")
//    WebElement Product6thTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[7]")
//    WebElement Product7thTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[8]")
//    WebElement Product8thTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[9]")
//    WebElement Product9thTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[10]")
//    WebElement Product10thTileImages;
//    @FindBy(xpath = "(//div[@class='_2E1FGS'])[11]")
//    WebElement Product11thTileImages;





    public  Flipkart_Tv_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }
    public void ValidateAppliancesCategory() {
        Actions actions = new Actions(driver);
        WebElement AppliancesCategory = Appliances;
        actions.moveToElement(AppliancesCategory).perform();
        AppliancesCategory.click();
    }
    public void ValidateFour_k_Tv() {
        Actions actions = new Actions (driver);
        WebElement TvFour = Four_K_Tv;
        actions.moveToElement(TvFour).perform();
        TvFour.click ();

    }

    public void ValidateMi_55k_SmartTV() {
        Actions actions = new Actions (driver);
        WebElement MiTv = Mi_55k_SmartTV;
        actions.moveToElement(MiTv).perform();
        MiTv.click ();
    }

    public void Validate_All_ProductTailImages() throws InterruptedException {
        Actions actions = new Actions (driver);
        actions.scrollToElement (ProductTileImages).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        List<WebElement> TileImages = (List<WebElement>) ProductTileImages;
        System.out.println ("Total no of elements:" + TileImages.size ());
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        for (int i = 0; i < TileImages.size (); i++) {
            Thread.sleep (5000);
            TileImages.get (i).click ();
        }
    }

    public void ValidateValidPinCode() {

        Actions actions = new Actions(driver);
        WebElement EnterPinCode = PinCode;
        WebElement Click_CheckButton = EnterPinCode;
        actions.moveToElement(EnterPinCode).perform();
        EnterPinCode.sendKeys("500073");
        Click_CheckButton.click();
    }
    public void ValidateAddToCart() {
        Actions actions = new Actions(driver);
        WebElement AddProduct = AddToCart;
        actions.moveToElement(AddProduct).perform();
        AddProduct.click();

    }
    public void ValidateAddingMoreProduct() {
        Actions actions = new Actions (driver);
        WebElement menuOption = AddTwoMoreQuantity;
        actions.moveToElement(menuOption).perform();
        menuOption.click ();

    }
    public void ValidateRemoveQuantity() {
        Actions actions = new Actions (driver);
        WebElement menuOption = RemoveAddedQuantity;
        actions.moveToElement(menuOption).perform();
        menuOption.click ();

    }
    public void ValidatePlaceToOrder() {
        Actions actions = new Actions (driver);
        WebElement menuOption =PlaceToOrder;
        actions.moveToElement(menuOption).perform();
        menuOption.click ();
    }
}

