package com.enverx.utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHelper {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Scroll down by 500 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        // Adding a delay for visibility
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll up by 500 pixels
        js.executeScript("window.scrollBy(0,-500)");

        // Adding a delay for visibility
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        
        private WebDriver driver;

        public ScrollHelper(WebDriver driver) {
            this.driver = driver;
        }

        public void scrollDown() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
        }

        public void scrollUp() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-500)");
        }
    }
   
   

   

