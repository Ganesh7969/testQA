package com.enverx.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class ValidateUserLogOut extends BaseClass {
	@Test
	public void validateuserlogoutTest() throws Throwable {
		
		LoginPage lp = new LoginPage(driver);
		lp.userlogin(userbaseurl, investoremail, investorpassword);
		lp.signout();
			
		
		
	}
	@AfterClass
    public void tearDown() {
        // Close the browser and perform cleanup
        if (driver != null) {
            driver.quit();
        }
    }
	

}
