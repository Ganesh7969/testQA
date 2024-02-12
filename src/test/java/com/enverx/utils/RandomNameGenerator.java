package com.enverx.utils;

import java.util.Random;

public class RandomNameGenerator {
	


	    private static final String[] FIRST_NAMES = {"John", "Jane", "Michael", "Emily", "David", "Olivia", "Daniel", "Sophia"};
	    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson"};

	    public static String getRandomFirstName() {
	        Random random = new Random();
	        int index = random.nextInt(FIRST_NAMES.length);
	        return FIRST_NAMES[index];
	    }

	    public static String getRandomLastName() {
	        Random random = new Random();
	        int index = random.nextInt(LAST_NAMES.length);
	        return LAST_NAMES[index];
	    }

	    //public static void main(String[] args) {
	        String firstName = getRandomFirstName();
	        String lastName = getRandomLastName();

	       // System.out.println("Random First Name: " + firstName);
	       // System.out.println("Random Last Name: " + lastName);
	    //}
	}



