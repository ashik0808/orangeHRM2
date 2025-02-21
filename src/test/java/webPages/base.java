package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class base {
	WebDriver driver;
	public Actions act;
	JavascriptExecutor js;
	base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		js= (JavascriptExecutor) driver;
		
	}
	public void clearText()
	{
		act.keyDown(Keys.CONTROL).keyDown("A").keyDown(Keys.DELETE).keyUp(Keys.DELETE).keyUp("A").keyUp(Keys.CONTROL).build().perform();	
	}
	//js Executor SendKeys
	public void enterTextusingJs(WebElement wb,String value)
	{
		try {
			if(wb!=null)
			{
				System.out.println("Tag Name: " + wb.getTagName());
			}
			
			js.executeScript("arguments[0].setAttribute('value','"+value+"')", wb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 

	}
	public void scroll()
	{
		js.executeScript("location.reload();");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	}
}
