//package com.enverx.utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class WaitUtils {
//    public static  int DEFAULT_TIMEOUT = 10; // Default timeout in seconds
//
//    public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {
//  //      WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
//        return wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    public static WebElement waitForVisibilityOfElement(WebDriver driver, WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT_SECONDS);
//        return wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    // Add more methods as needed for other common wait conditions
//}
//
//
