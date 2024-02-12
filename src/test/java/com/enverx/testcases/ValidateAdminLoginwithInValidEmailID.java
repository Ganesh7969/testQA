package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateAdminLoginwithInValidEmailID extends BaseClass{
	@Test
	public void loginTestwithinvalidemailid() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.launchURL(baseurl);
		lp.validateInvalidEmail(invalidadminemail, password);
		

		
		
	}

}
