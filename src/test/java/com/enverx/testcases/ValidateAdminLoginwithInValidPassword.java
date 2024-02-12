package com.enverx.testcases;

import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateAdminLoginwithInValidPassword  extends BaseClass{
	@Test
	public void validateAdminLoginwithInValidPassword() throws InterruptedException
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.validateInValidPassword(driver, username);
		
	}

}
