package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ObjectInit;

import static org.junit.Assert.fail;

import org.junit.Assert;;


public class LoginSteps {
		
	@When("^the user with \"([^\"]*)\" login on portal with credential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_with_login_on_portal_with_credential_and(String arg1, String arg2, String arg3) throws Throwable {
		System.out.println("Role :: "+arg1+" username:: "+arg2+" password ::"+arg3);
	}

	
	@When("^I enter username \"([^\"]*)\" and passowrd \"([^\"]*)\"$")
	public void i_enter_username_and_passowrd(String username, String password) throws Throwable {
			ObjectInit.objLoginPage.enterUsername(username);
			ObjectInit.objLoginPage.enterPassword(password);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		
		ObjectInit.objLoginPage.clickLoginButton();
	}

	@Then("^the correct username \"([^\"]*)\" should be displayed$")
	public void the_correct_username_should_be_displayed(String expectedUsername) throws Throwable {
		Thread.sleep(5000);
		String actualUsername = ObjectInit.objProfilePage.getUsername().toLowerCase();
		
		if(!actualUsername.contains(expectedUsername.toLowerCase()))
			Assert.fail(expectedUsername+ "is not present in" +actualUsername);
	}
	
}
