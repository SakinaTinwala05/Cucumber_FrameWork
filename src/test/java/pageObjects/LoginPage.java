package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "ap_email")
	@CacheLookup
	private WebElement email;

	@FindBy(id = "continue")
	@CacheLookup
	private WebElement submit;

	@FindBy(id = "ap_password")
	@CacheLookup
	private WebElement password;

	@FindBy(id = "signInSubmit")
	@CacheLookup
	private WebElement signIn;

	public void enterEmail(String mail) {

		email.clear();
		email.sendKeys(mail);
	}

	public void continueButton(String sb) {

		submit.click();
	}

	public void enterPassword(String pw) {

		password.clear();
		password.sendKeys(pw);
	}

	public void signInButton(String login) {

		signIn.click();
	}

}
