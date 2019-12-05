package steps;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.ObjectInit;	

public class BrowserInit {
	
	RemoteWebDriver driver;
	WebDriverWait wait;
	String AppURL = "https://www.fthecouch.com/portal/account/signin";
	
	
	@Before
	public void InitSetup() throws MalformedURLException, InterruptedException
	{
		System.out.println("Init started");
	
		////////////////// iOS real device  \\\\\\\\\\\\\\\\
		
		String platform = System.getProperty("platform").trim().toLowerCase();
		
		if(platform.equalsIgnoreCase("ios"))
		{
			System.out.println("/************* Selected platform = " + platform + " **********\\");
			
		DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability("testobjectApiKey", "580A8664A557447E90C43C7F38177CE1");
         
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone_6_free");
        capabilities.setCapability("cacheId", "16ea658d164");
        capabilities.setCapability("browserName", "safari");
        capabilities.setCapability("initialBrowserUrl", "https://www.fthecouch.com/portal/account/signin");     
        capabilities.setCapability("testobject_app_id", "1");
        capabilities.setCapability("name", "iOS - Safari Browser - 	Real device - test env");
        capabilities.setCapability("appiumVersion", "1.15.0");
        capabilities.setCapability("autoWebview", true);
                  
        driver = new RemoteWebDriver(new URL("https://us1-manual.app.testobject.com/wd/hub"), capabilities);
		
		}
		else if(platform.equalsIgnoreCase("android"))
		{
		
		/////////////////// Android real device   \\\\\\\\\\\\\\\
			
		System.out.println("/************* Selected platform = " + platform + " **********\\");
			
        DesiredCapabilities capabilities = new DesiredCapabilities();
      
        capabilities.setCapability("testobjectApiKey", "06C8838A16A240D78DE312D18FF77BC3");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Samsung_Galaxy_S6_sjc_free");
        capabilities.setCapability("cacheId", "16ea26d56b5");
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("testobject_app_id", "1");
        capabilities.setCapability("name", "Android - Chrome browser - Real device - test env");
        capabilities.setCapability("appiumVersion", "1.15.0");
        capabilities.setCapability("noReset", false);
    	capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);
		capabilities.setCapability("autoGrantPermissions", true);
             
        driver = new RemoteWebDriver(new URL("https://us1-manual.app.testobject.com/wd/hub"), capabilities);
        
		}
		
		wait = new WebDriverWait(driver, 60);
		
		driver.get(AppURL);
		
		Thread.sleep(5000);
		
		System.out.println("Init done");
	
		System.out.println("Object Initialization Started");
		
		ObjectInit obj = new ObjectInit(driver, wait);
		obj.objectInitialization();
		
		System.out.println("Object Initialization completed");
	}
	
	@After
	public void Exit()
	{
		driver.quit();
	}
}
