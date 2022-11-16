package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();



	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.orderPage().ordersButton);
	    logger.info("User clicked on orders button");
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	    click(factory.orderPage().showDetailsFirstOrder);
	    logger.info("User clicked on show details link under orders");
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    click(factory.orderPage().cancelTheOrderBtn);
	    logger.info("User clicked on cancel the order button");
	}
	@And("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() {
	  selectByVisibleText(factory.orderPage().reasonInput, "Bought wrong item");
	  logger.info("User selected the correct option from dropdown menu");
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.orderPage().cancelOrderbtn);
	    logger.info("User clicked on cancel order button");
	}
	
	@And("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayed() {
		
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelOrderSuccessfulMsg));
		logger.info("Message is displayed for successfull cancelled order!");
	}


	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnItemsBtn);
	    logger.info("User clicked on return items button");
	}
	@When("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
	   selectByVisibleText(factory.orderPage().reasonInput, "Item damaged");
	   logger.info("User selected item damaged from dropdown menu");
	}
	@When("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
	    selectByVisibleText(factory.orderPage().dropOffInput, "FedEx");
	    logger.info("User selected FedEx from dropdown menu");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	   click(factory.orderPage().returnOrderBtn);
	   logger.info("User clicked on return order button");
	}
	
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnSuccessfulMessage));
		logger.info("Return was successfill message was displaed with a confirmation number");
	}


	@When("User click on Review button")
	public void userClickOnReviewButton() {
	   click(factory.orderPage().reviewButton);
	   logger.info("User clicked on review button under orders");
	}
	@When("User write Review headline ‘ headline value’ and ‘review text’")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText() {
	    sendText(factory.orderPage().headlineInput, "Ordering things are fun when its FREEEEE!!");
	    sendText(factory.orderPage().descriotionInput, "I loved the website for the most part but "
	    		+ "sometimes finding a locator was challenging. Since this is a learning experience "
	    		+ "its better to have a tough time here than our future job :) Great project overall!");
	    		logger.info("User filled out both required fields to enter review!");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.orderPage().addYourReviewButton);
	    logger.info("User clicked on add your review button after writing review");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
	    slowDown();
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewAddedSuccessMEssage));
	    logger.info("User should see a message for review was added successfully");
	}


}
