package com.enverx.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.enverx.pageobjects.LoginPage;

public class LoginTest extends BaseClass {
	

	  //  private WebDriver driver;
	   // private LoginPage loginPage;

	    @BeforeClass
	    public void setUp() throws Throwable {
	        
	       // driver = new ChromeDriver();
	        //Thread.sleep(5000);
	        //driver.manage().window().maximize();
	        LoginPage lp = new LoginPage(driver);
	        lp.adminlogin(baseurl, username, password); 
	    
	    }

	    @Test
	    public void testInvalidLogin() {
	       // driver.get(userbaseurl);
	        LoginPage lp = new LoginPage(driver);
	        lp.setusername(invalidadminemail);
	        lp.setpassword(invalidPassword);
	       

	    	
	       // loginPage.setusername("invalidadminemail");
	       // loginPage.setpassword("invalidPassword");
	       // loginPage.clickuserfinalsigninbutton();

	        // Assert that an error message is displayed
	       // Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not displayed for invalid login");
	    }

	    @Test
	    public void testValidLogin() {
	       // driver.get(userbaseurl);
	    	LoginPage lp = new LoginPage(driver);
	    	lp.setusername(username);
	    	lp.setpassword(password);
	       // loginPage.setusername("useremail");
	        //loginPage.setpassword("userpassword");
	       // loginPage.clickuserfinalsigninbutton();

	        // Assert that login is successful by verifying the URL or presence of a logged-in element
	        Assert.assertEquals(driver.getCurrentUrl(), "expectedURLAfterLogin", "Login unsuccessful");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}



