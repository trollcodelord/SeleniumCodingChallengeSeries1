package uk.co.zoopla.TestBase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import uk.co.zoopla.utilities.utility;


public class Testbase {
	
	
	public static Properties pro;
	public static WebDriver driver;
	
	
	
	public Testbase() throws IOException {
		
		pro = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("Users/a121yn0n/Documents/workspace/uk.co.zoopla/src/main/java/uk/co/zoopla/config/config.properties"));
		pro.load(fis);
		}

	
	
	public void initialisation() throws IOException{
		
		String browserName = pro.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/uk.co.zoopla/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/uk.co.zoopla/geckodriver");
			driver = new FirefoxDriver();
		}
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(utility.CONSTANT_PAGELOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utility.CONSTANT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
		
		
	}
}		
			
			