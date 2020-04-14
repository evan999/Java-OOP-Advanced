package com.java.advanced;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
	public static void show() {
		try {
			FileReader reader = new FileReader("file.txt");
			System.out.println("File opened");
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			//System.out.println(ex.getMessage());
		}

	}
	
	public static void sayHello(String name) {
		System.out.println(name.toUpperCase());
	}
}	
