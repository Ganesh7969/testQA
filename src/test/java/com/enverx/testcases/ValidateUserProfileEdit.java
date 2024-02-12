package com.enverx.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;
import com.enverx.pageobjects.ProfilePage;

public class ValidateUserProfileEdit extends BaseClass {
	@Test
	public void validateuserprofileedit() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.userlogin(userbaseurl, useremail, userpassword);
		ProfilePage pp = new ProfilePage(driver);
		pp.validateuserprofileedit();
		pp.keyineditprofiledetails(randomfirstName, randomlastName);
		
		
	}
	
	
	
	
	
	
	@AfterClass
     public void tearDown() {
		// Close the browser and perform cleanup
     if (driver != null) {
        driver.quit();
      }
 }

}
