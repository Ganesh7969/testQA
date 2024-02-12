package com.enverx.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerExample {
	
	
	    public static void main(String[] args) throws Throwable {
	        // Setup ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();

	        // Create an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a website
	        driver.get("https://user.dev.vericap.io/");
	        Thread.sleep(5000);

	        // Perform some actions (e.g., print the title)
	        System.out.println("Page title: " + driver.getTitle());

	        // Close the browser
	        driver.quit();
	    }
	}



