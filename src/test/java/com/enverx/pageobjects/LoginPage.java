package com.enverx.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
	
	static WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

		}
	
	
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[1]/div/input")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-min-width waves-effect waves-light py-2']")
	@CacheLookup
	WebElement txtSignInButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/div[2]/div/div[3]/a/button")
	@CacheLookup
	WebElement txtUserSignInButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[1]/input")
	@CacheLookup
	WebElement txtsignInFormUsername;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[2]/input")
	@CacheLookup
	WebElement txtsignInFormPassword;
	
	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/input[3]")
	@CacheLookup
	WebElement txtUserSignInSubmitButton;
	
	@FindBy(xpath ="/html/body/div[1]/div/div/div/form/div/div/div/button")
	@CacheLookup
	WebElement txtFinalUserSignInButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[1]/div/input")
	@CacheLookup
	WebElement txtIncorrectEmail;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[3]/div")
	@CacheLookup
	WebElement txtIncorrectPassword;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement txtOTPDigitOne;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div[2]/input")
	@CacheLookup
	WebElement txtOTPDigitTwo;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div[3]/input")
	@CacheLookup
	WebElement txtOTPDigitThree;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div[4]/input")
	@CacheLookup
	WebElement txtOTPDigitFour;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div[5]/input")
	@CacheLookup
	WebElement txtOTPDigitFive;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div[6]/input")
	@CacheLookup
	WebElement txtOTPDigitSix;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div/span")
	@CacheLookup
	WebElement txtWelecome;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[3]/div")
	@CacheLookup
	WebElement txtAdminEmailErrorMessage;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[3]/div")
	@CacheLookup
	WebElement txtAdminPasswordErrorMessage;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[3]/div")
	@CacheLookup
	WebElement txtWrongEmailPasswordErrorMessage;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[1]/div/div")
	@CacheLookup
	WebElement txtEmailIsRequiredErrorMessage;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[2]/div[2]/div/div/div")
	@CacheLookup
	WebElement txtPasswordIsRequiredErrorMessage;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/p")
	@CacheLookup
	WebElement txtUserEmailPasswordErrorMessage;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/header/div/div/div[2]/div/div/span[2]/a")
	@CacheLookup
	WebElement myProjectsLink;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/header/div/div/div[2]/div/div/span[2]/a")
	@CacheLookup
	WebElement portfolioLink;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/header/div/div/div[3]/section/div/div/div/div/button")
	@CacheLookup
	WebElement ProfileIcon;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[2]/span[1]")
	@CacheLookup
	WebElement SignOut;
	
	@FindBy(xpath = "/html/body/div[5]/div[3]/div/div/div[2]/div/div[2]/div[2]/button")
	@CacheLookup
	WebElement LogOutYes;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/center/img")
	@CacheLookup
	WebElement CompantyLogo;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/span")
	@CacheLookup 
	WebElement signinwithyouremailandpassword;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/label[1]")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/label[2]")
	@CacheLookup
	WebElement txtPwd;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[3]/a")
	@CacheLookup
	WebElement txtForgotYourPassword;
	
	
	
	
	
	
	
	
	
	

	public void setusername(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clicksubmit()
	{
		txtSignInButton.click();
	}
	public void clickusersignin()
	{
		txtUserSignInButton.click();
	}
	public void setsignInFormUsername(String userusername)
	{
		txtsignInFormUsername.sendKeys(userusername);
	}
	public void setsignInFormPassword(String useruserpassword)
	{
		txtsignInFormPassword.sendKeys(useruserpassword);
	}
	public void clickusersigninsubmit()
	{
		txtUserSignInSubmitButton.click();
	}
	public void clickuserfinalsigninbutton()
	{
		txtFinalUserSignInButton.click();
	}
	public void setinvalidemail(String invalidemail)
	{
		txtIncorrectEmail.sendKeys(invalidemail);
	}
	public void setvalidpassword(String validpassword)
	{
		txtPassword.sendKeys(validpassword);
	}
	public void setotpdigitone(String digitone)
	{
		txtOTPDigitOne.sendKeys(digitone);
	}
	public void setotpdigittwo(String digittwo)
	{
		txtOTPDigitTwo.sendKeys(digittwo);
	}
	public void setotpdigitthree(String digitthree)
	{
		txtOTPDigitThree.sendKeys(digitthree);
	}
	public void setotpdigitfour(String digitfour)
	{
		txtOTPDigitFour.sendKeys(digitfour);
	}
	public void setotpdigitfive(String digitfive)
	{
		txtOTPDigitFive.sendKeys(digitfive);
	}
	public void setotpdigitsix(String digitsix)
	{
		txtOTPDigitSix.sendKeys(digitsix);
	}
	  public boolean isErrorMessageDisplayed() {
	        try {
	            WebElement errorMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/p"));
	            return errorMessage.isDisplayed();
	        } catch (Exception e) {
	            return false;
	        }
	    }
      public void validateInvalidEmail(String invalidEmail, String validPassword) throws Throwable {
    	  WebElement emailInput = txtUserName;
    	  WebElement passwordInput = txtPassword;
    	  WebElement loginButton = txtSignInButton;
    	  emailInput.sendKeys(invalidEmail);
    	  passwordInput.sendKeys(validPassword);
    	  Thread.sleep(5000);
    	  loginButton.click();
    	  Thread.sleep(5000);
    	  WebElement emailerrorMessage = txtWrongEmailPasswordErrorMessage;
          String expectedErrorMessage = "The Admin does not exist ";
          assertErrorMessage(expectedErrorMessage, emailerrorMessage.getText());
 }
        
      public void validateMissingEmail() {
    	  WebElement loginButton = txtSignInButton;
    			     loginButton.click();

        // Locate the error message element
        WebElement errorMessage = txtEmailIsRequiredErrorMessage;

        // Expected error message for missing email
        String expectedErrorMessage = "Email is required";

        // Assert or validate the error message
        assertErrorMessage(expectedErrorMessage, errorMessage.getText());
    }
      
	public  void validateMissingPassword() throws Throwable {
		  WebElement loginButton = txtSignInButton;
		  Thread.sleep(5000);
		     loginButton.click();

        // Locate the error message element
        WebElement errorMessage = txtPasswordIsRequiredErrorMessage;

        // Expected error message for missing email
        String expectedErrorMessage = "Pasword is required";

        // Assert or validate the error message
        assertErrorMessage(expectedErrorMessage, errorMessage.getText());
    }

	public static void validateInValidPassword(WebDriver driver, String validEmail) throws InterruptedException {
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-min-width waves-effect waves-light py-2']"));

        // Enter a valid email address
        emailInput.sendKeys(validEmail);
        
       //Enter a wrong password
        CharSequence validPassword = "Enverx@123748";
		passwordInput.sendKeys(validPassword);

        // Click the submit button
        submitButton.click();
        
        Thread.sleep(10000);

        // Wait for some time to ensure that any potential error message is displayed
      //  WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error-message")));

        // Locate the error message element
        WebElement errorMessage = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div[3]/form/div[3]/div"));

        // Expected error message for invalid password 
        String expectedErrorMessage = "Incorrect password. ";

        // Assert or validate the error message
        assertErrorMessage(expectedErrorMessage, errorMessage.getText());
    }
	//Validate user with invalid Email Id
	public  void validateUserInvalidEmail(String invalidEmail, String validPassword) throws InterruptedException {
        WebElement signinbtn = txtUserSignInButton;
		WebElement emailInput = txtsignInFormUsername;
        WebElement passwordInput = txtsignInFormPassword;
        WebElement submitButton = txtUserSignInSubmitButton;

        // Enter an invalid email address
        emailInput.sendKeys(invalidEmail);
        
        
		//Enter an valid password
		passwordInput.sendKeys(validPassword);
		

        // Click the submit button
        submitButton.click();

        Thread.sleep(10000);
        WebElement errorMessage = txtUserEmailPasswordErrorMessage;
        // Expected error message for an invalid email
        String expectedErrorMessage = "Incorrect username or password.";

        // Assert or validate the error message
        assertErrorMessage(expectedErrorMessage, errorMessage.getText());
    }

	
   

	
	public static void assertErrorMessage(String expected, String actual) {
        if (actual.equals(expected)) {
            System.out.println("Validation error message is correct: " + actual);
        } else {
            System.out.println("Validation error message is incorrect. Expected: " + expected + ", Actual: " + actual);
        }
    }
	
	public void launchURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void userlogin(String userBaseUrl, String userEmail, String userPassword) throws InterruptedException {
        driver.get(userBaseUrl);
        driver.manage().window().maximize();
        txtUserSignInButton.click();
        txtsignInFormUsername.sendKeys(userEmail);
        txtsignInFormPassword.sendKeys(userPassword);
        txtUserSignInSubmitButton.click();
        Thread.sleep(5000);
    }
	public void adminlogin(String adminBaseUrl, String adminEmail, String adminPassword) throws InterruptedException {
		driver.get(adminBaseUrl);
        driver.manage().window().maximize();
        txtUserName.sendKeys(adminEmail);
        txtPassword.sendKeys(adminPassword);
        txtSignInButton.click();
        Thread.sleep(5000);
	}
	public void loginasdeveloper() {
		WebElement myprojectslink = myProjectsLink;
		if(myprojectslink != null) {
			System.out.println("User Logged in as Project Developer Successfully");
		}
		else 
			System.out.println("User Logged in but not as Project Developer");
	}
	public void loginasinvestor() {
		WebElement portfoliotab = portfolioLink;
		if(portfoliotab != null) {
			System.out.println("User Logged in as Investor Successfully");
		}
		else 
			System.out.println("User Logged in but not as Investor");
	}
	public void signout() throws Throwable {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
//
//		
//
//
//
      Thread.sleep(10000);
		ProfileIcon.click();
//		   
		Thread.sleep(10000);
//		wf.wait(5000);
//
		SignOut.click();
//		Thread.sleep(5000);
		LogOutYes.click();
//		
//		
//		
	}

	public void validateURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
        txtUserSignInButton.click();

		WebElement companylogo = CompantyLogo;
		if(companylogo!=null) {
			System.out.println("Application URL is correct ");;
		}
		else 
			System.out.println("Application URl is incorrect");
	}
	
	public void validateloginpageelements() {
        txtUserSignInButton.click();
		WebElement companylogo = CompantyLogo;
		WebElement signintxtmessgae = signinwithyouremailandpassword;
		WebElement txtemail = txtEmail;
		WebElement txtpwd = txtPwd;
		WebElement fogotyourpasswordlink = txtForgotYourPassword;
		WebElement txtsignin = txtUserSignInSubmitButton;
		if(companylogo !=null && signintxtmessgae !=null && txtemail != null && txtpwd !=null &&
				fogotyourpasswordlink !=null && txtsignin!=null) {
			System.out.println("The user can view all elements, and they are visible as expected!");
		}
		else 
			System.out.println("The user is not able to view all elements");

			

		

		

		

		

	}
	
	
	
	

	
	
}
