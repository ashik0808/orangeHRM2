package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class commonMenu extends base{

	public commonMenu(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@placeholder='Search']")
	WebElement searchInput;
	
	@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement menuName;

	@FindBy(className = "bi-question-lg")
	WebElement helpicon;
	
	
	public void searchInput(String menuName) {
		searchInput.sendKeys(menuName);
	}
	
	public void clickMenu() {
		menuName.click();
	}
	public String hoverAndClickHelpicon()
	{
		Action action = act.moveToElement(helpicon).click().build();
		String value=helpicon.getDomProperty("title");
		action.perform();
		helpicon.click();		
		return value;
	}
	
}
