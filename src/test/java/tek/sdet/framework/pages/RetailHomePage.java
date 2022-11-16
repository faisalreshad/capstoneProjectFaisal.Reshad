package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(id="categoryTitle")
	public WebElement homePageText;
    
	@FindBy(id="signinLink")
	public WebElement signInButton;
	
	@FindBy(xpath="//span[text()='All']")
	public WebElement allButton;
	
	@FindBy(xpath= "//span[text()='Electronics']")
	public WebElement electronicsTab;
	
	@FindBy(xpath= "//span[text()='Computers']")
	public WebElement computersTab;
	
	@FindBy(xpath= "//span[text()='Smart Home']")
	public WebElement smartHomeTab;
	
	@FindBy(xpath= "//span[text()='Sports']")
	public WebElement sportsTab;
	
	@FindBy(xpath= "//span[text()='Automative']")
	public WebElement automativeTab;
	
	@FindBy(xpath="//span[text()='TV & Video']")
	public WebElement tvAndVideoOption;
	
	@FindBy(xpath="//span[text()='Video Games']")
	public WebElement videoGamesOption;
	
	@FindBy(xpath="//span[text()='Accessories']")
	public WebElement accessoriesOption;
	
	@FindBy(xpath="//span[text()='Networking']")
	public WebElement networkingOption;
	
	@FindBy(xpath="//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLightningOption;
	
	@FindBy(xpath="//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutletsOption;
	
	@FindBy(xpath="//span[text()='Athletic Clothing']")
	public WebElement athleticClothingOption;
	
	@FindBy(xpath="//span[text()='Exercise & Fitness']")
	public WebElement excerciseAndFitnessOption;
	
	@FindBy(xpath="//span[text()='Automative Parts & Accessories']")
	public WebElement automativePartsAndAccessoriesOption;
	
	@FindBy(xpath="//span[text()='MotorCycle & Powersports']")
	public WebElement motorCycleAndPowerSportsOption;
	
	@FindBy(xpath="//select[@id='search']")
	public WebElement dropDownBar;
	
	@FindBy(xpath="//select/option[@value='3']")
	public WebElement smartHomeDropdown;
	
	@FindBy(id="searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath="//button[@class='search__btn']")
	public WebElement searchButton;
	
	@FindBy(xpath="//p[@class='products__name']")
	public WebElement itemClicked;
	
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement quantityDropDown;

	@FindBy(xpath="//select[@class='product__select']/option[2]")
	public WebElement selectQuantityDropdown;
	
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addToCartButton;
	
	@FindBy(id="cartQuantity")
	public WebElement cartButtonQuantity;
	
	@FindBy(xpath="//p[text()='Cart ']")
	public WebElement cartButtonOnTop;
	
	@FindBy(id="proceedBtn")
	public WebElement proceedToCheckoutButton;
	
	@FindBy(id="addAddressBtn")
	public WebElement addAddressBtn;
	
	@FindBy(id="countryDropdown")
	public WebElement shippingCountryDropdown;
	
	@FindBy(id="fullNameInput")
	public WebElement shippingFullNameField;
	
	@FindBy(id="phoneNumberInput")
	public WebElement shippingPhoneNumberInput;
	
	@FindBy(id="streetInput")
	public WebElement shippingStreetInput;
	
	@FindBy(id="apartmentInput")
	public WebElement shippingApartmentInput;
	
	@FindBy(id="cityInput")
	public WebElement shippingCityInput;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement shippingStateDropdown;
	
	@FindBy(id="zipCodeInput")
	public WebElement shippingZipCodeInput;

	@FindBy(id="addressBtn")
	public WebElement shippingAddAddressButton;
	
	@FindBy(id="addPaymentBtn")
	public WebElement addCreditOrDebitCardBtn;
	
	@FindBy(id="cardNumberInput")
	public WebElement orderCardNumberInput;

	@FindBy(id="nameOnCardInput")
	public WebElement orderNameOnCardField;

	@FindBy(id="expirationMonthInput")
	public WebElement orderExpirationMonthDropdown;

	@FindBy(id="expirationYearInput")
	public WebElement orderExpirationYearDropdown;


	@FindBy(id="securityCodeInput")
	public WebElement orderSecurityCodeField;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement orderAddYourCardButton;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeYourOrderButton;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMessage;
	
}
