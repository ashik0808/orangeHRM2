package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import webPages.AdminPage;
import webPages.commonMenu;
import webPages.loginPage;

public class TC_003_Reset_SelectedValues_In_AdminPage extends basePage {
		@Test
		 void searchAndReset()
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
			ap.clickReset();
			String value=ap.getUsernameText();
			System.out.println(value.length()+"is Value");
			Assert.assertEquals(value.length(),0);
			
			
	        
			
		}
}
