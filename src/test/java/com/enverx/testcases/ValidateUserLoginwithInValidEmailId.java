package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateUserLoginwithInValidEmailId extends BaseClass {

	@Test
	public void validateuserloginwithinvalidemailid() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.launchURL(userbaseurl);
		lp.clickusersignin();
		lp.validateUserInvalidEmail(invalidadminemail, password);
	}
	
}
