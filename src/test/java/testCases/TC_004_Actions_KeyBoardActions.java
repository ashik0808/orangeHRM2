package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import webPages.AdminPage;
import webPages.commonMenu;
import webPages.loginPage;

public class TC_004_Actions_KeyBoardActions extends basePage {
		@Test
		 void searchAndReset() throws Exception 
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
			//for clear text >> pointing 
			ap.enterInput("Admin");
			ap.clearText();
			String value=ap.getUsernameText();
			System.out.println(value.length()+"is Value");
			Assert.assertEquals(value.length(),0);
			
			cm.hoverAndClickHelpicon();
			Thread.sleep(2000);
	        
			
		}
}
