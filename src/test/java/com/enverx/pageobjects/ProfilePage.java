package com.enverx.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
	
	static WebDriver driver;
	public ProfilePage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

		}
	@FindBy(xpath="/html/body/div[1]/div[1]/div/header/div/div/div[3]/section/div/div/div/div/button/span[1]/div")
	@CacheLookup
	WebElement ProfileIcon;
	
	
	@FindBy(xpath="/html/body/div[2]/div[3]/ul/div[1]/a/li/span[1]")
	@CacheLookup
	WebElement txtProfile;
	
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/div[1]/div/span")
	@CacheLookup
	WebElement TitleProfile;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[2]/div/div/form/div/div[1]/div[2]/button")
	@CacheLookup
	WebElement ProfileEditButton;
	
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/input")
	@CacheLookup
	WebElement ProfileFirstName;
	
	@FindBy(name="lastname")
	@CacheLookup
	WebElement ProfileLastName;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement ProfileGender;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement ProfilePhoneNumber;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement ProfileCountry;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement ProfileTimeZone;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[2]/div/div/form/div[2]/div/button[1]")
	@CacheLookup
	WebElement ProfileSave;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement ProfileCancel;
	
	public void setfirstname(String firstname) {
		ProfileFirstName.sendKeys(firstname);	
	}
	public void setlastname(String lastname) {
		ProfileFirstName.sendKeys(lastname);	
	}
	
	
	
	public void validateuserprofileedit() throws Exception {
		Thread.sleep(5000);
		ProfileIcon.click();
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/ul/div[1]/a/li/span[1]")));
	//driver.manage().window().fullscreen();
		Thread.sleep(5000);
		txtProfile.click();
		Thread.sleep(5000);

		ProfileEditButton.click();
        WebElement title = TitleProfile;
        if(title!=null) {
        	System.out.println("User should successfully redirected into user profile details page");
        }
        else 
        {
        	System.out.println("User should not redirected into user profile details page");
        }
       
        }
	
	public void keyineditprofiledetails(String firstname, String lastname) {
		ProfileFirstName.clear();
		ProfileFirstName.sendKeys(firstname);
		ProfileLastName.clear();
		ProfileLastName.sendKeys(lastname);
		ProfileSave.click();
		}
	







}
