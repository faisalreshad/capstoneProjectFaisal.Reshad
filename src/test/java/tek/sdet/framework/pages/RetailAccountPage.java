package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
public RetailAccountPage() {
	PageFactory.initElements(getDriver(), this);
}

@FindBy(id="nameInput")
public WebElement nameInput;

@FindBy(id="emailInput")
public WebElement emailInput;

@FindBy(id="passwordInput")
public WebElement passwordInput;

@FindBy(id="confirmPasswordInput")
public WebElement confirmPasswordInput;

@FindBy(id="signupBtn")
public WebElement signUpButton;

@FindBy(xpath = "//h1[@class='account__personal-title']") 
public WebElement yourProfileText;

@FindBy(id="personalUpdateBtn")
public WebElement updateButton;

@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
public WebElement personalInformationUpdateMessage;

@FindBy(id="accountLink")
public WebElement accountButton;

@FindBy(id="phoneNumberInput")
public WebElement phoneNumberInput;


@FindBy(id="previousPasswordInput")
public WebElement previousPasswordInput;

@FindBy(id="newPasswordInput")
public WebElement newPasswordInput;

@FindBy(id="confirmPasswordInput")
public WebElement confirmPasswordInpt;

@FindBy(xpath="//div[text()='Password Updated Successfully']")
public WebElement passwordUpdatedSuccessfullyMessage;

@FindBy(id="credentialsSubmitBtn")
public WebElement changePasswordButton;


@FindBy(xpath="//p[text()='Add a payment method']")
public WebElement addPaymentLink;

@FindBy(id="cardNumberInput")
public WebElement cardNumberInput;

@FindBy(id="nameOnCardInput")
public WebElement nameOnCardField;

@FindBy(id="expirationMonthInput")
public WebElement expirationMonthDropdown;

@FindBy(id="expirationYearInput")
public WebElement expirationYearDropdown;


@FindBy(id="securityCodeInput")
public WebElement securityCodeField;

@FindBy(id="paymentSubmitBtn")
public WebElement paymentSubmitButton;

@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
public WebElement paymentMethodAddedMessage;

@FindBy(xpath="//img[@src='/images/master_card.png']")
public WebElement cardsAndAccountButton;



@FindBy(xpath="//button[text()='Edit']")
public WebElement cardEditLink;

@FindBy(xpath="//button[text()='remove']")
public WebElement removeCardLink;

@FindBy(xpath="//p[@class='account__payment__sub-text']")
public WebElement paymentSubText;
@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
public WebElement popUpMsg;

@FindBy(xpath= "//h1[@class='account__payment-new-title']")
public WebElement AddDebitOrCreditCartMsg;


@FindBy(xpath="//div[@class='account__address-new']")
public WebElement addAddressbtn;


@FindBy(id="countryDropdown")
public WebElement addressCountryDropdown;

@FindBy(id="fullNameInput")
public WebElement addressFullNameInput;

@FindBy(xpath="(//input[@id='phoneNumberInput'][@name='phoneNumber'])[2]")
public WebElement addressPhoneNumberInput;

@FindBy(id="streetInput")
public WebElement addressStreetInput;

@FindBy(id="apartmentInput")
public WebElement addressApartmentInput;

@FindBy(id="cityInput")
public WebElement addressCityInput;

@FindBy(xpath="//select[@name='state']")
public WebElement addressStateDropdown;

@FindBy(id="zipCodeInput")
public WebElement addressZipCodeInput;

@FindBy(id="addressBtn")
public WebElement addressAddYourAddressButton;

@FindBy(xpath="//div[text()='Address Added Successfully']")
public WebElement addressAddedSuccessMessage;

@FindBy(xpath="//button[text()='Edit']")
public WebElement addressEditLink;

@FindBy(id="addressBtn")
public WebElement addressUpdateButton;

@FindBy(xpath="//div[text()='Address Updated Successfully']")
public WebElement addressUpdatedMessage;

@FindBy(xpath="//button[text()='Remove']")
public WebElement addressRemoveLink;







}
