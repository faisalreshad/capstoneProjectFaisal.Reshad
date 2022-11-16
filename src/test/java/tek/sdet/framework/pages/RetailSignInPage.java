package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
public RetailSignInPage() {
	PageFactory.initElements(getDriver(), this);
}

@FindBy(id="email")
public WebElement emailField;

@FindBy(id="password")
public WebElement passwordField;

@FindBy(id="loginBtn")
public WebElement logInButton;

@FindBy(id="logoutBtn")
public WebElement logOutButton;

@FindBy(id="newAccountBtn")
public WebElement createNewAccountButton;


















}
