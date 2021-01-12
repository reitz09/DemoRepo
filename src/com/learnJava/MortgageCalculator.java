package com.learnJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		
		final float number_of_months=12;
		final float percent= 100;
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("Principal:");
	 int principal = scanner.nextInt();
	
	 
	 System.out.print("Annual Rate of Interest:");
	 double annual_RI = scanner.nextDouble();
	 
	 System.out.print("Period:");
	 int period = scanner.nextInt();
	
		
		double r = annual_RI/percent/number_of_months;
		int n = period*12;
		
		double mortgage = ((Math.pow(1+r, n)*r)/ (Math.pow(1+r, n)-1))*principal;
		
		
	    String formatted_mortgage = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortage Amount: "+formatted_mortgage) ;
	   
		


	}

}
