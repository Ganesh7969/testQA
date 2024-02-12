package com.enverx.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SecurityPage {
	WebDriver driver;
	public SecurityPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/header/div/div/div[3]/section/div/div/div/div/button/span[1]/div")
	@CacheLookup
	WebElement txtUserIcon;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/ul/div[4]/a/li/span[1]")
	@CacheLookup
	WebElement txtSecurity;
	
	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[1]/div/span")
	@CacheLookup
	WebElement txtSecurityTitle;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[3]/div/div[1]/span")
	@CacheLookup
	WebElement txtTwoFactorAuthenticationTitle;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[3]/div/div[2]/div[1]/div[2]/span[1]")
	@CacheLookup
	WebElement txtAuthenticatorApp;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[3]/div/div[2]/div[2]/div[2]/span[1]")
	@CacheLookup
	WebElement txtPhoneNumberVerification;
	
	@FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div[3]/div/div[2]/div[2]/span")
	@CacheLookup
	WebElement txtSetUpNow;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[2]/button")
	@CacheLookup
	WebElement ChangePasswordButton;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/form/div/div/button")
	@CacheLookup
	WebElement ResetPasswordButton;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/form/div/div/div[1]/div[2]/span")
	@CacheLookup
	WebElement txtPleaseEnterYourCurrentPassword;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[2]/span")
	@CacheLookup
	WebElement txtPleaseEnteraPassword;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/form/div/div/div[3]/div[2]/span")
	@CacheLookup
	WebElement txtPleaseConfirmYourPassword;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/form/div/div/div[1]/div[1]/div")
	@CacheLookup
	WebElement OldPassword;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/form/div/div/div[2]/div[1]/div/input")
	@CacheLookup
	WebElement NewPassword;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div[2]/div/div[2]/div/form/div/div/div[3]/div[1]/div/input")
	@CacheLookup
	WebElement ConfirmPassword;
	
	
	
	public void setusericon()
	{
		txtUserIcon.click();
	}
	
	public void setsecurityicon()
	{
		txtSecurity.click();
	}
	public void setauthenticatorapp()
	{
		//WebElement locator = txtAuthenticatorApp;
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10), Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
		txtAuthenticatorApp.click();
	}
	
	public void validatechangepasswordbutton() throws InterruptedException {
		txtUserIcon.click();
		Thread.sleep(5000);
		txtSecurity.click();
		Thread.sleep(5000);
		ChangePasswordButton.click();
		}
	public void validateerrorvalidationschangepassword() throws InterruptedException {
		Thread.sleep(5000);
		OldPassword.click();
		Thread.sleep(5000);

		NewPassword.click();
		ConfirmPassword.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("arguments[0].scrollIntoView();", ResetPasswordButton);
		try {
		ResetPasswordButton.click();
		}catch(Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();",ResetPasswordButton );


		}
		WebElement oldpassworderrormessage = txtPleaseEnterYourCurrentPassword;
		WebElement enterpassworderrormessage = txtPleaseEnteraPassword;
		WebElement confirmpassworderrormessage = txtPleaseConfirmYourPassword;
		String expectederrormessage = "Please enter your current password";
        assertErrorMessage(expectederrormessage, oldpassworderrormessage.getText());

		oldpassworderrormessage.getText();
		enterpassworderrormessage.getText();
		confirmpassworderrormessage.getText();
		}
	public static void assertErrorMessage(String expected, String actual) {
        if (actual.equals(expected)) {
            System.out.println("Validation error message is correct: " + actual);
        } else {
            System.out.println("Validation error message is incorrect. Expected: " + expected + ", Actual: " + actual);
        }
    }
	
	

}
