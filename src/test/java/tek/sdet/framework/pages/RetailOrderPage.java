package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(id="orderLink")
	public WebElement ordersButton;
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement showDetailsFirstOrder;
	
	@FindBy(xpath= "//button[text()='Cancel The Order']")
	public WebElement cancelTheOrderBtn;
	
	@FindBy(id="reasonInput")
	public WebElement reasonInput;

	@FindBy(xpath="//button[@class='order__cancel-submit']")
	public WebElement cancelOrderbtn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelOrderSuccessfulMsg;
	
			
	@FindBy(xpath="//button[text()='Return Items']")
	public WebElement returnItemsBtn;
	
	
	@FindBy(id="dropOffInput")
	public WebElement dropOffInput;
	
	@FindBy(xpath="//button[@class='order__cancel-submit']")
	public WebElement returnOrderBtn;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnSuccessfulMessage;
	
	
	@FindBy(xpath="//button[text()='Review']")
	public WebElement reviewButton;
	
	@FindBy(id="headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id="descriptionInput")
	public WebElement descriotionInput;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement addYourReviewButton;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessMEssage;
	
	
	
	
	
	
	
	
	
}
