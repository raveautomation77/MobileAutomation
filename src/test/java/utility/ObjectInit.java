package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import pages.*;

public class ObjectInit {
	
	public static HomePageObject objHomePage = null;
	public static LoginPageObject objLoginPage = null;
	public static ProfilePageObject objProfilePage = null;
	
	WebDriver driver = null;
	Wait wait = null;
	
	public ObjectInit(WebDriver driver, Wait wait)
	{
		this.driver = driver;
		this.wait = wait;
	}
	
	public void objectInitialization()
	{
		objHomePage = new HomePageObject(driver);
		objLoginPage = new LoginPageObject(driver);
		objProfilePage = new ProfilePageObject(driver);
	}

}
