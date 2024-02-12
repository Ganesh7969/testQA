package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateAdminMissingEmail extends BaseClass {

	@Test
	public void adminMissingEmail()
	{
		LoginPage lp = new LoginPage(driver);
		lp.launchURL(baseurl);
		lp.validateMissingEmail();
		
	}
}
