package com.enverx.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomersPage {
	static WebDriver ldriver;
	public CustomersPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath = "/html/body/div/nav/ul/li[7]")
	@CacheLookup
	WebElement txtCustomerssidebar;
	
	@FindBy(xpath = "/html/body/div[2]/a")
	@CacheLookup
	WebElement txtCustomerslink;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")
	@CacheLookup
	WebElement txtInviteUsersButton;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div[1]/div/input")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div[2]/div/input")
	@CacheLookup 
	WebElement txtLastName;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div[3]/div/input")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div[4]/div/div/div[1]/input")
	@CacheLookup
	WebElement txtMobileNumber;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div[5]/div/select")
	@CacheLookup
	WebElement txtUserType;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[1]/div/div/p/div/button")
	@CacheLookup 
	WebElement txtInvite;
	
	
	
	
	
	public void clickcustomerssidebar()
	{
		try {
		txtCustomerssidebar.click();
		}catch(NullPointerException e) {
			
		}
	}
	public void clickcustomerslink()
	{
		txtCustomerslink.click();
	}
	public void clickinviteusersbutton()
	{
		txtInviteUsersButton.click();
	}
	public void setfirstname(String firstname)
	{
		txtFirstName.sendKeys(firstname);
	}
	public void setlastname(String lastname)
	{
		txtLastName.sendKeys(lastname);
	}
	public void setemail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setmobilenumber(String mobilenumber)
	{
		txtMobileNumber.sendKeys(mobilenumber);
	}
	public void clickusertype()
	{
		txtUserType.click();
	}
	
	public void clickinvite()
	{
		txtInvite.click();
	}
	
 


   
}
