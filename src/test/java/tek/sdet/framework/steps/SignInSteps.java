package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	private POMFactory factory = new POMFactory();
	
	// testingAgain
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	  click(factory.homePage().signInButton);
	  logger.info("User clicked on signIn button");
	  
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
	  sendText(factory.signInPage().emailField, email);
	  sendText(factory.signInPage().passwordField, password);
	  logger.info("User sent both email and password");
	  
	  
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	  click(factory.signInPage().logInButton);
	  logger.info("User clicked on log in button");
	  
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	  Assert.assertTrue(isElementDisplayed(factory.signInPage().logOutButton));
	  logger.info("User should be able to see logout button");
	}
		
	
}

