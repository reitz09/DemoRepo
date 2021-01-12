package com.learnJava;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		 int number = scanner.nextInt();
		 
		 if (number%5==0 && number%3==0) {
			 System.out.println("FIZZBUZZ");
			 }
		 else if(number%5==0) {
			 System.out.println("BUZZ");
		 }
		 else if(number%3==0) {
			 System.out.println("FIZZ");
		 }
		 else {
			 System.out.println(number);
		 }
		 }

	}


