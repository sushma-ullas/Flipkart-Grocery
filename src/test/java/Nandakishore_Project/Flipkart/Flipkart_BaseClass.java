package Nandakishore_Project.Flipkart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.Duration;

public class Flipkart_BaseClass {
    public static WebDriver driver;
    public static String baseUrl;
    //public static ExtentReports ER;
    public static String browser = "chrome";
    //public static Logger logger = LogManager.getLogManager ().getLogger (FlipkartBaseClass.class.getName ());
    public static void openBrowser(String browserName, String baseUrl) {
        if (browserName.equalsIgnoreCase ("chrome")) {
            WebDriverManager.chromedriver ().setup ();
            ChromeOptions options = new ChromeOptions ();
            options.addArguments ("--no-sandbox--");
            options.addArguments ("--disable-dev-shm-usage--");
            options.addArguments ("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get (baseUrl);
            driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        } else if (browserName.equalsIgnoreCase ("firefox")) {
            WebDriverManager.firefoxdriver ().setup ();
            driver = new FirefoxDriver();
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        } else if (browserName.equalsIgnoreCase ("edge")) {
            WebDriverManager.edgedriver ().setup ();
            driver = new EdgeDriver();
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        }
        driver.manage ().window ().maximize ();
        // logger.info (browserName +"Launch browser successfully ");
        driver.get (baseUrl);
        driver.getCurrentUrl ();
    }

    public static void takeScreenshot(String screenshotName) throws Exception {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (srcFile, new File ("ScreenShot/" + screenshotName + ".png"));
        //logger.info ("Take Screen shot" + screenshotName);
    }

    public static void LoinPopup() {
        for (String winHandle : driver.getWindowHandles ()) {
            driver.switchTo ().window (winHandle);
            System.out.println ("Window Switch");
            driver.findElement (By.xpath ("//button[@class='_2KpZ6l _2doB4z']")).click ();
        }
    }
    public static void Wait_Method(){
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        driver.manage ().timeouts ().pageLoadTimeout (Duration.ofSeconds (40));

    }
    public static void closeBrowser()
    {
        driver.quit ();
        // logger.info ("Browser close successfully ");

    }


}


