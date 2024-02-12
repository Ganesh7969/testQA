package com.enverx.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

	
	

	public class LeftBarNavigationExample {

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://dev-admin.enverx.com/signin"); // Replace with the actual URL

	        // Find left bar navigation items using tag name
	        List<WebElement> navigationItems = driver.findElements(By.tagName("li"));

	        // Iterate through navigation items and print text
	        for (WebElement navigationItem : navigationItems) {
	            System.out.println(navigationItem.getText());
	        }

	        // Close the browser
	        driver.quit();
	    }
	}



