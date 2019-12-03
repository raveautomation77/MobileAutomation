package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageObject {
	
	WebDriver driver; 
	By txtUsername = By.id("mat-input-0");
	By txtPassword = By.id("mat-input-1");
	By btnLogin = By.xpath("//div[@class='login-btn-grp']//input[contains(@class,'btn-danger')]");
	
	public LoginPageObject(WebDriver driver)
	{
		this.driver = driver;
	}

	public void enterUsername(String username)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsername));
		driver.findElement(txtUsername).sendKeys(username);
	}
	

	public void enterPassword(String password)
	{
		driver.findElement(txtPassword).sendKeys(password);
	}

	
	public void clickLoginButton()
	{
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(btnLogin));
		driver.findElement(btnLogin).click();
	}

}
