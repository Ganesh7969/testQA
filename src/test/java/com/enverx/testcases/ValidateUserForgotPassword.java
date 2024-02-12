package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.ForgotPasswordPage;
import com.enverx.pageobjects.LoginPage;

public class ValidateUserForgotPassword extends BaseClass{
	@Test
	public void validateuserforgotpassword() throws Exception
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.launchURL(userbaseurl);
		lp.clickusersignin();

		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		Thread.sleep(5000);
		fp.clickuserforgotpassword();
		fp.setuseremail(useremail);
		fp.clickresetmypasswordbutton();
	}

	
}
