package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject {
		
	WebDriver driver; 
	
	By btnLogin = By.className("signup-login-mobile");
	
	public HomePageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigateToLoginPage()
	{
		driver.findElement(btnLogin).click();
	}
	
	
}
