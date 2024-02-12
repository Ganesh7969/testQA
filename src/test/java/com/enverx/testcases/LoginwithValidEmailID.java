package com.enverx.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;
import com.enverx.utils.LoggerManager;

import io.opentelemetry.api.logs.Logger;

public class LoginwithValidEmailID  extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.adminlogin(baseurl, username, password);
        Assert.assertEquals(driver.getTitle(), "Vericap", "Login unsuccessful");

	}
		
		
	
		 @AfterClass
		    public void tearDown() {
		        // Close the browser and perform cleanup
		        if (driver != null) {
		            driver.quit();
		        }
		    }

	

}
