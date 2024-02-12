package com.enverx.utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class LoggerManager {
    public LoggerManager(WebDriver driver) {
		
	}

	public static  Logger logger = LogManager.getLogger(LoggerManager.class.getName());

	
	//public void info(String string) {
	 //System.out.println(string);
	//}
}




