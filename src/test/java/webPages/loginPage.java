package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends base{


	public loginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(className = "orangehrm-login-button")
	WebElement loginButton;

	public void setUserName(String name) {
		userName.sendKeys(name);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	public void callJs(String value)
	{
		
		enterTextusingJs(userName,value);
	}
}
