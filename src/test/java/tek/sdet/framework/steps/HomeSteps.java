package tek.sdet.framework.steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().homePageText));
		logger.info("Shop by Category (text) should be visible in homepage prior to signing in");

	}
	@When("User click on All section")
	public void userClickOnAllSection() {
	   click(factory.homePage().allButton);
	   logger.info("User clicked on All sidebar");
	   
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
			
		List<String> allSectionOptionsSideBar = data.values();
		
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronicsTab));
		Assert.assertTrue(isElementDisplayed(factory.homePage().computersTab));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeTab));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sportsTab));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automativeTab));
			
		logger.info("All tabs are currently displayed");
		
	}
	@When("User on {string}")
	public void userOnDepartment(String department) {
		
		if(department.equalsIgnoreCase("Electronics")) {
			click(factory.homePage().electronicsTab);
		}else if(department.equalsIgnoreCase("Computers")) {
			click(factory.homePage().computersTab);
		}else if(department.equalsIgnoreCase("Smart Home")) {
			click(factory.homePage().smartHomeTab);
		}else if(department.equalsIgnoreCase("Sports")) {
			click(factory.homePage().sportsTab);
		}
			else if(department.equalsIgnoreCase("Automotive")) {
				click(factory.homePage().automativeTab);
			}else {
				throw new RuntimeException("You provided an invalid department name");
			}
		logger.info("user is selecting department = " + department);
		}
		
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable data) {
			
      List<String> options=  data.values();
      logger.info("Checking department Items " +options.get(0)+ ", " + options.get(1));
     
		Assert.assertTrue(getWebElementByText(options.get(0)).isDisplayed());
		Assert.assertTrue(getWebElementByText(options.get(1)).isDisplayed());

	}
	
	

	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String dropDown) {
		
		selectByVisibleText(factory.homePage().dropDownBar, dropDown);
		
		logger.info("User selected Smart Home option from dropdown");
		
	}
		
	@When("User search for an item {string}")
	public void userSearchForAnItem(String item) {

		sendText(factory.homePage().searchBar, item);
	
	   logger.info("user typed for kasa outdoor smart plug in search texbox");
	}
	
	
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	   click(factory.homePage().searchButton);
	   logger.info("user clicked on search button");
	}
	@When("User click on item")
	public void userClickOnItem() {
	    click(factory.homePage().itemClicked);
	    logger.info("User clicked on kasa outdoor plug item");
	}
	
	
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String numberOfItem) {
	  
		selectByVisibleText(factory.homePage().quantityDropDown, numberOfItem);
		logger.info("user selected " + numberOfItem + " from dropdown");		
	}
	
	
	
	
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	    click(factory.homePage().addToCartButton);
	    logger.info("User clicked on add to cart button");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
	    Assert.assertTrue(quantity, isElementDisplayed(factory.homePage().cartButtonQuantity));
	    logger.info("Cart button displays " + quantity);
	}

	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartButtonOnTop);
		logger.info("user clicked on cart icon at the top of page");
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedToCheckoutButton);
		logger.info("User clicked on proceed to checkout button");
	}
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addAddressBtn);
		logger.info("User clicked on add a new address link");
	}
	
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String,String>> shippingAddress = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.homePage().shippingCountryDropdown, shippingAddress.get(0).get("country"));
		sendText(factory.homePage().shippingFullNameField, shippingAddress.get(0).get("fullName"));
		sendText(factory.homePage().shippingPhoneNumberInput, shippingAddress.get(0).get("phoneNumber"));
		sendText(factory.homePage().shippingStreetInput, shippingAddress.get(0).get("streetAddress"));
		sendText(factory.homePage().shippingApartmentInput, shippingAddress.get(0).get("apt"));
		sendText(factory.homePage().shippingCityInput, shippingAddress.get(0).get("city"));
		selectByVisibleText(factory.homePage().shippingStateDropdown, shippingAddress.get(0).get("state"));
		sendText(factory.homePage().shippingZipCodeInput, shippingAddress.get(0).get("zipCode"));
		logger.info("User entered all required address fields");
		
	}
	

	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addCreditOrDebitCardBtn);
		logger.info("User clicked on add a credit or debit card button");
	}
	
	

	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeYourOrderButton);
		logger.info("User clicked on place your order button");
	}
	
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMessage));
		logger.info("Messaged appears!");
	}
		
	
}
