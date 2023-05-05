package library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Launch Browser and open flipkart website
public class BaseClass {
	public static WebDriver driver;
	public static Logger logger = LogManager.getLogger(BaseClass.class.getName());
	
	public static void openBrowser(String browsername, String baseUrl){
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();//base
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get(baseUrl);
		}else if(browsername.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(baseUrl);
			
			
		}else if(browsername.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(baseUrl);
			
			
		}
		}
		
	}


