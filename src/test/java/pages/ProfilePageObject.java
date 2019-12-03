package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePageObject {
		
	WebDriver driver; 
	
	public ProfilePageObject(WebDriver driver)
	{
		this.driver = driver;
	}

	
	By lblUsername = By.className("name-title");
	
	public String getUsername() throws InterruptedException 
	{
		Thread.sleep(10000);
		return driver.findElement(lblUsername).getText();
	}
	
}
