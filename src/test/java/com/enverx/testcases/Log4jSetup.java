package com.enverx.testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jSetup {
	
	

	    private static final Logger logger = LogManager.getLogger(Log4jSetup.class);

	    public static void main(String[] args) {
	        logger.info("Log4j configuration is loaded successfully!");
	        logger.debug("done");
	        //System.out.print("Hello");
	    }
	}



