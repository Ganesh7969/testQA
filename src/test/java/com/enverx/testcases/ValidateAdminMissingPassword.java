package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateAdminMissingPassword extends BaseClass {
	@Test
	public void adminMissingPassword() throws Throwable
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.launchURL(baseurl);
		lp.validateMissingPassword();
				
	}

}
