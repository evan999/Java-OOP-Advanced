package com.java.fundamentals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator2018 calculator = new TaxCalculator2018(100000);
		TaxReport report = new TaxReport(calculator);
		report.show();
		
		report.setCalculator(new TaxCalculator2019());
		report.show();
		//System.out.println("Hello");
	}
	
	
}
