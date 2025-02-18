package webPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class base {
	WebDriver driver;
	public Actions act;
	base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	public void clearText()
	{
		act.keyDown(Keys.CONTROL).keyDown("A").keyDown(Keys.DELETE).keyUp(Keys.DELETE).keyUp("A").keyUp(Keys.CONTROL).build().perform();	
	}

}
