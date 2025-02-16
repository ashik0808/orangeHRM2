package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base {
	WebDriver driver;

	base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
