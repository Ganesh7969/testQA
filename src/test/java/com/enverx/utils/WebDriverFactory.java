//package com.enverx.utils;
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//public class WebDriverFactory {
//	private static final long DEFAULT_SLEEP_TIMEOUT = 0;
//	WebDriver driver = new ChromeDriver(); // Initialize your WebDriver instance
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Initialize WebDriverWait with a timeout of 10 seconds
//
//	
//	public void WebDriverWait(WebDriver driver, Duration timeout) {
//	    this(
//	        driver,
//	        timeout,
//	        Duration.ofMillis(DEFAULT_SLEEP_TIMEOUT),
//	        Clock.systemDefaultZone(),
//	        Sleeper.SYSTEM_SLEEPER);
//	  }}
//	
//	
