package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.ForgotPasswordPage;

public class ValidateAdminForgotPassword extends BaseClass{
	@Test
	public void validateAdminForgotPassword()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		fp.clickforgotpasswordlink();
		fp.setemail(username);
		fp.clicksubmit();
		
	}

}
