package com.java.fundamentals;

public class TaxReport {
	private TaxCalculator calculator;
	
	public TaxReport(TaxCalculator calculator) {
		this.calculator = calculator;
	}
	
	public void show() {
		double tax = calculator.calculateTax();
		System.out.println(tax);
	}
}
