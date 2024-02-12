package com.enverx.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateApplicationURL  extends BaseClass{
	@Test
	public void validateapplicationurltest() {
		LoginPage lp = new LoginPage(driver);
		lp.validateURL(userbaseurl);
	}

	@AfterClass
    public void tearDown() {
        // Close the browser and perform cleanup
        if (driver != null) {
            driver.quit();
        }
	}
}
