package com.enverx.testcases;

import java.util.logging.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.enverx.pageobjects.DropdownPage;
import com.enverx.utils.PropertyConfigurator;
import com.enverx.utils.RandomEmailGenerator;
import com.enverx.utils.RandomMobileNumberGenerator;
import com.enverx.utils.RandomNameGenerator;
import com.enverx.utils.ReadConfiq;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfiq readconfiq = new ReadConfiq();
	RandomNameGenerator RandomNameGenerator = new RandomNameGenerator();
	RandomEmailGenerator RandomEmailGenerator = new RandomEmailGenerator();
	RandomMobileNumberGenerator RandomMobileNumberGenerator = new RandomMobileNumberGenerator();
	
	
	

	public String baseurl = readconfiq.getAdminApplicationURL();
	public String username = readconfiq.getAdminEmail();
	public String password = readconfiq.getAdminPassword();
	public String userbaseurl =readconfiq.getUserApplicationURL();
	public String useremail = readconfiq.getUserEmail();
	public String userpassword = readconfiq.getUserPassword();
	public String investoremail = readconfiq.getUserInvestorEmail();
	public String investorpassword = readconfiq.getUserInvestorPassword();
	public String invalidadminemail = "test1234@enverx.com";
	public String validPassword = "Enverx@123";
	public String invalidPassword = "Vericap@543";
	public String digitone = "1";
	public String digittwo = "2";
	public String digitthree = "3";
	public String digitfour = "4";
	public String digitfive = "5";
	public String digitsix = "6";
	public String randomfirstName = RandomNameGenerator.getRandomFirstName();
	public String randomlastName = RandomNameGenerator.getRandomLastName();
	public String randomemail = RandomEmailGenerator.generateRandomEmail();
	public String randommobile = RandomMobileNumberGenerator.generateRandomMobileNumber();
	public String usertypedev = "Project Developer";
	public String usertypeinv = "Investor";


	


	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Webdriver\\Extensions\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\ganes\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
	     // ChromeOptions options = new ChromeOptions();

     // WebDriverManager.chromedriver().setup();

      //String chromeBinaryPath = "C:\\Users\\ganes\\Downloads\\chrome-win64(1)\\chrome-win64\\chrome.exe";

        //options.setBinary(chromeBinaryPath);

         //WebDriver driver = new ChromeDriver();




		
		
		
		//logger  = Logger.getLogger("enverx");
		//PropertyConfigurator.configure("log4j.properties");
		//driver.get(baseurl);
					
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@AfterClass
	//public void tearDown()
	//{
	//	driver.quit();
	//}
}
