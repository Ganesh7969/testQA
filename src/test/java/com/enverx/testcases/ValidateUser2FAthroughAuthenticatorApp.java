package com.enverx.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;
import com.enverx.pageobjects.SecurityPage;
import com.enverx.utils.ScrollHelper;


public class ValidateUser2FAthroughAuthenticatorApp extends BaseClass{
	
	@Test
	public void authTest() throws InterruptedException
	{
		//Login 
		driver.get(userbaseurl);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.clickusersignin();
		lp.setsignInFormUsername(useremail);
		lp.setsignInFormPassword(userpassword);
		lp.clickusersigninsubmit();
	//	Thread.sleep(20000);
	//	lp.clickuserfinalsigninbutton();
		Thread.sleep(10000);
		
		//Security - 2FA Authenticator app
		SecurityPage sp = new SecurityPage(driver);
        ScrollHelper scrollHelper = new ScrollHelper(driver);
        //Alert alert = driver.switchTo().alert();
        //String alertMessage = alert.getText(); // Get text from the alert
       // alert.accept(); // Accept the alert (click OK)
         //alert.dismiss(); // Use this to dismiss (click Cancel) if needed


		sp.setusericon();
		sp.setsecurityicon();
        scrollHelper.scrollDown();

		sp.setauthenticatorapp();
		
      

		
	}

	

}
