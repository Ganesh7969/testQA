package com.enverx.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	static WebDriver driver;
	public ForgotPasswordPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
}
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/div[2]/div/div[3]/a/button")
	@CacheLookup
	WebElement txtUserSignInButton;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[2]/div[1]/a")
	@CacheLookup
	WebElement  txtForgotPasswordLink;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[1]/div/input")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-min-width']")
	@CacheLookup
	WebElement txtSubmit;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/form/input[2]")
	@CacheLookup
	WebElement txtUserEmail;
	
	@FindBy(name = "reset_my_password")
	@CacheLookup
	WebElement txtResetMyPasswordbutton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[3]/a")
	@CacheLookup
	WebElement txtUserForgotPasswordLink;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/center/img")
	@CacheLookup
	WebElement CompanyLogo;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/h1")
	@CacheLookup
	WebElement txtForgotYourPassword;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/span")
	@CacheLookup
	WebElement txtForgotMessage;
	

	
	public void clickforgotpasswordlink()
	{
		txtForgotPasswordLink.click();
	}
	
	public void setemail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void clicksubmit()
	{
		txtSubmit.click();
	}
	public void clickuserforgotpassword()
	{
		txtUserForgotPasswordLink.click();
	}
	public void setuseremail(String useremail)
	{
		txtUserEmail.sendKeys(useremail);

	}
	public void clickresetmypasswordbutton()
	{
		txtResetMyPasswordbutton.click();	
	}
	
	
	public static void validateInvalidForgotEmail(WebDriver adriver, String invalidEmail) throws InterruptedException {
        WebElement emailInput = adriver.findElement(By.name("email"));
        WebElement submitButton = adriver.findElement(By.xpath("//button[@class='btn btn-primary btn-min-width']"));

        // Enter an invalid email address
        emailInput.sendKeys(invalidEmail);
        
        // Click the submit button
        submitButton.click();

        Thread.sleep(10000);
        // Wait for some time to ensure that any potential error message is displayed
      //  WebDriverWait wait = new WebDriverWait(adriver, 10);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error-message")));

        // Locate the error message element
        WebElement errorMessage = adriver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div[3]/div/div"));
        // Expected error message for an invalid email
        String expectedErrorMessage = "The Admin does not exist";

        // Assert or validate the error message
        assertErrorMessage(expectedErrorMessage, errorMessage.getText());
    }
	public static void assertErrorMessage(String expected, String actual) {
        if (actual.equals(expected)) {
            System.out.println("Validation error message for forgot email is correct: " + actual);
        } else {
            System.out.println("Validation error message for forgot email correct. Expected: " + expected + ", Actual: " + actual);
        }
    }
	
	public void validateforgotpasswordpageelements() {
		txtUserSignInButton.click();
		txtUserForgotPasswordLink.click();

		
		WebElement companylogo = CompanyLogo;
		WebElement txtforgotyourpassword = txtForgotYourPassword;
		WebElement txtforgotmessage = txtForgotMessage;
		WebElement txtresetmybutton = txtResetMyPasswordbutton;
		if (companylogo!=null && txtforgotyourpassword!=null && txtforgotmessage !=null
				&&txtresetmybutton !=null) {
			System.out.println("The user can view all elements, and they are visible as expected");
			}
		
			else 
				System.out.println("The user is not able to view all the  elements");
		
			
				
		
		
		


		
	}
	
	
}

	
	
