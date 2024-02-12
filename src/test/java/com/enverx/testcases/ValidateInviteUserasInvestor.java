package com.enverx.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.CustomersPage;
import com.enverx.pageobjects.DropdownPage;
import com.enverx.pageobjects.LoginPage;
import com.enverx.utils.RandomEmailGenerator;
import com.enverx.utils.RandomMobileNumberGenerator;
import com.enverx.utils.RandomNameGenerator;

public class ValidateInviteUserasInvestor extends BaseClass {
	@Test
	public void validateinviteuserasinvestor() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.adminlogin(baseurl, username, password);
		CustomersPage cp = new CustomersPage(driver);
		cp.clickcustomerssidebar();
		cp.clickcustomerslink();
		Thread.sleep(5000);
		cp.clickinviteusersbutton();
		Thread.sleep(5000);

        
       cp.setfirstname(randomfirstName);
        cp.setlastname(randomlastName);
        cp.setemail(randomemail);
        cp.setmobilenumber(randommobile);
        cp.clickusertype();
        Thread.sleep(5000);
        DropdownPage dp = new DropdownPage(driver);
        Thread.sleep(5000);
        dp.selectOptionByVisibleText(usertypeinv);
        cp.clickinvite();
       Thread.sleep(10000);
		
	}
	@AfterClass
    public void tearDown() {
        // Close the browser and perform cleanup
        if (driver != null) {
            driver.quit();
        }
    }

}
