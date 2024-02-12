package com.enverx.utils;
import java.util.Random;

	public class RandomEmailGenerator {

	    public static String generateRandomEmail() {
	        String baseEmail = "testuser";
	        String domain = "@yopmail.com";
	        

	        Random random = new Random();
	        int randomNumber = random.nextInt(10000); // Adjust the upper limit as needed

	        String randomEmail = baseEmail + randomNumber + domain;
	        return randomEmail;
	    }

	   // public static void main(String[] args) {
	        String randomEmail = generateRandomEmail();
	     //   System.out.println("Random Email: " + randomEmail);
	    //}
	}


