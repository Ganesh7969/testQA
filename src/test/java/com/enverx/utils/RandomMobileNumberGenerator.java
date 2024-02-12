package com.enverx.utils;
import java.util.Random;


public class RandomMobileNumberGenerator {
	


	    public static String generateRandomMobileNumber() {
	        Random random = new Random();

	        // Generating a random 10-digit mobile number
	        StringBuilder mobileNumber = new StringBuilder("9"); // Start with 9 to ensure a valid Indian mobile number
	        for (int i = 0; i < 9; i++) {
	            mobileNumber.append(random.nextInt(10));
	        }

	        return mobileNumber.toString();
	    }

	  //  public static void main(String[] args) {
	        String randomMobileNumber = generateRandomMobileNumber();
	    //    System.out.println("Random Mobile Number: " + randomMobileNumber);
	    //}
	}



