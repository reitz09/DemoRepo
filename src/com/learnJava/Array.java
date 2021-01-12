package com.learnJava;

public class Array {

	public static void main(String[] args) {
		String [] fruits = {"Apple","Orange","Mango"};
//		for (int i=0; i<fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
		
		for (String fruit: fruits) {
			System.out.println(fruit);//for each loop always used forward only and index cannot be accessed
		}
		
		for (int i=fruits.length-1; i>=0; i--) {
			System.out.println(fruits[i]);
		}
	}

}
