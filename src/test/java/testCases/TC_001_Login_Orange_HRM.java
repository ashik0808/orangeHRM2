package testCases;

import org.testng.annotations.Test;

import webPages.loginPage;

public class TC_001_Login_Orange_HRM extends basePage {
		@Test
		 void loginApplication()
		{
			loginPage lp=new loginPage(driver);
			lp.setUserName(p2.getProperty("username"));
			lp.setPassword(p2.getProperty("password"));
			lp.clickLoginButton();
			
		}
}
