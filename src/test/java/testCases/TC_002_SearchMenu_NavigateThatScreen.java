package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import webPages.AdminPage;
import webPages.commonMenu;
import webPages.loginPage;

public class TC_002_SearchMenu_NavigateThatScreen extends basePage {
		@Test
		 void loginApplication()
		{
			loginPage lp=new loginPage(driver);
			lp.setUserName(p2.getProperty("username"));
			lp.setPassword(p2.getProperty("password"));
			lp.clickLoginButton();
			
			commonMenu cm=new commonMenu(driver);
			cm.searchInput("Admin");
			cm.clickMenu();
			
			AdminPage ap=new AdminPage(driver);
			ap.enterInput("Admin");
			ap.clickuserRoleDropdown();
			ap.clickuserRoleDropDownValue("Admin");
			ap.clickSubmit();
			String totalRecords=ap.getTotalRecords();
	        System.out.println(totalRecords);
	        Assert.assertEquals("(1) Record Found", totalRecords);
	        ap.clickEditIcon("Admin");
	       String title= ap.getTitle();
	       System.out.println(title);
	        
			
		}
}
