package basefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import TestUtil.TestUtility;




public class TestBase {
	
	public static WebDriver driver;  //Global variables, child classes also can use them.
	public static Properties prop;


	
	public TestBase() throws IOException{  //constructor
	     
		try{
		
        FileInputStream ip = new FileInputStream("/Users/vivekdpatel/Desktop/Selenium/Selenium_Workspace/ResolverTest/src/main/java/configfile/config.properties");
		
		prop = new Properties();
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
 }


//now after construction, create one Inilialization method to initialize the global variables.

   public static void initialization() throws IOException {
	   
	   String browserName = prop.getProperty("browser");
	   if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/vivekdpatel/Desktop/Selenium/SeleniumJars/geckodriver");
			driver = new FirefoxDriver();
	   }else {
	       System.setProperty("webdriver.chrome.driver", "/Users/vivekdpatel/Desktop/Selenium/SeleniumJars/chromedriver");
	       driver = new ChromeDriver();//open Chrome
	}
	  
	   
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtility.PAGE_LOAD_TIMEOUT));
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtility.IMPLICIT_WAIT));
	   
	   driver.get(prop.getProperty("url"));
	   
	   
	   
   } 
}

  