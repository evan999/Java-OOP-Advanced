package com.java.advanced;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
	public static void show() {
		//FileReader reader = null;
		
		try (
			// try with resources
			FileReader reader = new FileReader("file.txt");
			FileWriter writer = new FileWriter("...");	
		) {
			//reader = new FileReader("file.txt");
			int value = reader.read();
			new SimpleDateFormat().parse("");
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (IOException | ParseException e) {
			System.out.println("Could not read data");
		}
		

	}
	
	public static void sayHello(String name) {
		System.out.println(name.toUpperCase());
	}
}	
