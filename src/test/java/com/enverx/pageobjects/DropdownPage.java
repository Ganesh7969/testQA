package com.enverx.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

	    private WebDriver driver;
	    public DropdownPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Locator for the dropdown element
	    private By dropdownLocator = By.name("primaryRole");

	    // Method to select an option from the dropdown
	    public void selectOptionByVisibleText(String optionText) {
	        WebElement dropdownElement = driver.findElement(dropdownLocator);
	        Select dropdown = new Select(dropdownElement);
	        dropdown.selectByVisibleText(optionText);
	        
	    }
	}

