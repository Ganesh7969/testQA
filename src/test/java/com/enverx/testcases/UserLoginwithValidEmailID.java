package com.enverx.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;
import com.google.j2objc.annotations.ReflectionSupport.Level;

import io.opentelemetry.api.logs.Logger;

public class UserLoginwithValidEmailID  extends BaseClass{
	
	@Test
	public void UserloginwithValidEmailIdTest() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.userlogin(userbaseurl, useremail, userpassword);
		Thread.sleep(5000);
		lp.loginasdeveloper();
		}  
		

	@AfterClass
    public void tearDown() {
        // Close the browser and perform cleanup
        if (driver != null) {
            driver.quit();
        }
    }

	

}
