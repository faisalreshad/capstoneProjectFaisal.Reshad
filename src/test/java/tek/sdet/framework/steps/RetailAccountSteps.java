package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("User clicked on create account button");

	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {

		List<Map<String, String>> signUpInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().nameInput, signUpInfo.get(0).get("name"));
		sendText(factory.accountPage().emailInput, signUpInfo.get(0).get("email"));
		sendText(factory.accountPage().passwordInput, signUpInfo.get(0).get("password"));
		sendText(factory.accountPage().confirmPasswordInput, signUpInfo.get(0).get("confirmPassword"));
		logger.info("User entered all required fields to create account");

	}

	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.accountPage().signUpButton);
		logger.info("User clicked on sign up button");
	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().yourProfileText));
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateButton));
		logger.info("Both elements are displayed after successfully creating account");

	}

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountButton);
		logger.info("User clicked on account button");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().nameInput, name);
		sendText(factory.accountPage().phoneNumberInput, phone);
		logger.info("User sent required fields to update information");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("User clicked on update button");
		switchwindow(getTitle());

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		slowDown();
		
	 Assert.assertTrue(isElementDisplayed(getWebElementByTextUsingDiv("Personal Information Updated Successfully")));    
	 logger.info("personal information update message should be displayed temporarily");
		
		
		
		
	}

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable data) {

		List<Map<String, String>> signUpInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, signUpInfo.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, signUpInfo.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInpt, signUpInfo.get(0).get("confirmPassword"));
		logger.info("User sent all required information");
	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		waitTillClickable(factory.accountPage().changePasswordButton);
		click(factory.accountPage().changePasswordButton);
		logger.info("User clicked on change password button");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		slowDown();
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdatedSuccessfullyMessage)); 
//		logger.info("A successful password updated message appears");
		
		Assert.assertTrue(isElementDisplayed(getWebElementByTextUsingDiv("Password Updated Successfully")));
		logger.info("A successful password updated message appears");
		slowDown();
	}
	/////////////////////////////////////////////////CHANGES MADE FOR NEW FEATURE FILE
	
	@And("User enter below information again")
	public void userEnterBelowInformationAgain(DataTable data) {
		List<Map<String, String>> signUpInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, signUpInfo.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, signUpInfo.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInpt, signUpInfo.get(0).get("confirmPassword"));
		logger.info("User sent all required information again");
	}
	
	@And("User click on Change Password button again")
	public void userClickOnChangePasswordButtonAgain() {
		waitTillClickable(factory.accountPage().changePasswordButtonAgain);
		click(factory.accountPage().changePasswordButtonAgain);
		logger.info("User clicked on change password button again to revert to original password");
	}
	
	@Then("a message should be displayed again Password Updated Successfully")
	public void aMessageShouldBeDisplayedAgainPasswordUpdatedSuccessfull() {
		slowDown();		
		Assert.assertTrue(isElementDisplayed(getWebElementByTextUsingDiv("Password Updated Successfully")));
		logger.info("A successful password updated message appears");
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentLink);
		logger.info("User clicked on add your payment link");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> paymentInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, paymentInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardField, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthDropdown, "12");
	//	selectByVisibleText(factory.accountPage().expirationMonthDropdown, paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearDropdown, "2027");
	//	selectByVisibleText(factory.accountPage().expirationMonthDropdown, paymentInfo.get(0).get("expirationYear"));
	//  make sure you go to 
		sendText(factory.accountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
		logger.info("User filled out all requested information boxes");

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitButton);
		logger.info("User clicked on add your card");
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		slowDown();
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedMessage));
//		logger.info("Payment was added successfully message");
		
		Assert.assertTrue(isElementDisplayed(getWebElementByTextUsingDiv("Payment Method added sucessfully")));
		logger.info("Payment was added successfully message");
	}
	
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.accountPage().cardsAndAccountButton);
	    click(factory.accountPage().cardEditLink);
	    clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
	    clearTextUsingSendKeys(factory.accountPage().nameOnCardField);
	    clearTextUsingSendKeys(factory.accountPage().securityCodeField);
	    logger.info("User clicked on cards and account button and clicked on edit button");
	    
	    
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>> UpdatedPaymentInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, UpdatedPaymentInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardField, UpdatedPaymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthDropdown, "10");
		selectByVisibleText(factory.accountPage().expirationYearDropdown, "2030");
		sendText(factory.accountPage().securityCodeField, UpdatedPaymentInfo.get(0).get("securityCode"));
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	   click(factory.accountPage().paymentSubmitButton);
	   logger.info("user clicked on update your card button");
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
	 
		slowDown();
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().popUpMsg));
//		logger.info("Payment method updated message should appear");
		
		Assert.assertTrue(isElementDisplayed(getWebElementByTextUsingDiv("Payment Method updated Successfully")));
		logger.info("Payment method updated message should appear!");
	}
	
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cardsAndAccountButton);
		click(factory.accountPage().removeCardLink);
		//slowDown();
		logger.info("user clicked on remove link");
		
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	
	Assert.assertFalse(!isElementDisplayed(factory.accountPage().paymentSubText));
	logger.info("remove link not present");
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	  click(factory.accountPage().addAddressbtn);
	  logger.info("User clicked on add address button");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		
		List<Map<String, String>> addressField = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().addressCountryDropdown, "United States");
		sendText(factory.accountPage().addressFullNameInput,addressField.get(0).get("fullName"));
		sendText(factory.accountPage().addressPhoneNumberInput,addressField.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addressStreetInput,addressField.get(0).get("streetAddress"));
		sendText(factory.accountPage().addressApartmentInput,addressField.get(0).get("apt"));
		sendText(factory.accountPage().addressCityInput,addressField.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateDropdown, "Virginia");
		sendText(factory.accountPage().addressZipCodeInput,addressField.get(0).get("zipCode"));
		
		logger.info("User entered all requested information");
	
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().addressAddYourAddressButton);
	    logger.info("User clicked on add your address button");
	}
	
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
	    slowDown();
  	    Assert.assertTrue(isElementDisplayed(getWebElementByTextUsingDiv("Address Added Successfully")));
	    logger.info("User should see a message for address added successfully");
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	click(factory.accountPage().addressEditLink);
	logger.info("User clicked on Edit link");
	}
	
	@And("user fill updated address form with below information")
	public void userFillUpdatedAddressFormWithBelowInformation(DataTable data) {
		selectByVisibleText(factory.accountPage().addressCountryDropdown, "Select Country");
		clearTextUsingSendKeys(factory.accountPage().addressFullNameInput);
		clearTextUsingSendKeys(factory.accountPage().addressPhoneNumberInput);
		clearTextUsingSendKeys(factory.accountPage().addressStreetInput);
		clearTextUsingSendKeys(factory.accountPage().addressApartmentInput);
		clearTextUsingSendKeys(factory.accountPage().addressCityInput);
		selectByVisibleText(factory.accountPage().addressStateDropdown, "Select");
		clearTextUsingSendKeys(factory.accountPage().addressZipCodeInput);
		
		List<Map<String, String>> updatedAdressField = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().addressCountryDropdown, "United States");
		sendText(factory.accountPage().addressFullNameInput,updatedAdressField.get(0).get("fullName"));
		sendText(factory.accountPage().addressPhoneNumberInput,updatedAdressField.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addressStreetInput,updatedAdressField.get(0).get("streetAddress"));
		sendText(factory.accountPage().addressApartmentInput,updatedAdressField.get(0).get("apt"));
		sendText(factory.accountPage().addressCityInput,updatedAdressField.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateDropdown, "Virginia");
		sendText(factory.accountPage().addressZipCodeInput,updatedAdressField.get(0).get("zipCode"));
	}
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	   click(factory.accountPage().addressUpdateButton);
	   logger.info("User clicked on update your address button");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
	   slowDown();
//	   Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedMessage));
//	   logger.info("User should see a message for address updated successfully");
	   
	   Assert.assertTrue(isElementDisplayed(getWebElementByTextUsingDiv("Address Updated Successfully")));
	   logger.info("User should see a message for address updated successfully");
	   
	}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	    click(factory.accountPage().addressRemoveLink);
	    logger.info("User clicked on remove link under current address");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	   Assert.assertFalse(!isElementDisplayed(factory.accountPage().addressRemoveLink));
	    logger.info("Remove link under added address should not be present");
	}
	

}
