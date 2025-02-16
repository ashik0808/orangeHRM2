package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends base {

	public AdminPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "(//*[contains(text(),'Username')]/following::*)/input")
	WebElement inputName;
	
	@FindBy(xpath = "//*[@class='oxd-select-wrapper']/div/div")
	WebElement userRoleDropDown;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement searchButton;
	
	@FindBy(xpath = "(//*[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span)")
	WebElement totalRecords;
	
	@FindBy(className="orangehrm-main-title")
	WebElement title;
	
	@FindBy(xpath = "//button[normalize-space()='Reset']")
	WebElement resetButton;
	
	public String getTitle()
	{
		return title.getText();
		
	}
	public WebElement getUserRoleDropDownValue(String role) {
	    String dynamicXpath = "//*[@class='oxd-select-option']//span[text()='" + role + "']";
	    return driver.findElement(By.xpath(dynamicXpath));
	}

	public void clickEditIcon(String iconName) {
		driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border'][.//div[text()='"+iconName+"']]//button[contains(@class, 'oxd-icon-button')][2]")).click();
	}
	public void enterInput(String name) {
		inputName.sendKeys(name);
	}
	
	public void clickuserRoleDropdown()
	{
		userRoleDropDown.click();	
	}
	
	public void clickuserRoleDropDownValue(String dropDownValue)
	{
		getUserRoleDropDownValue(dropDownValue).click();
	}
	public void clickSubmit()
	{
		searchButton.click();	
	}
	public void clickReset()
	{
		resetButton.click();	
	}
	public String getUsernameText()
	{
		return inputName.getDomProperty("value");
	}
	public String getTotalRecords()
	{
		return totalRecords.getText();
	}
}
