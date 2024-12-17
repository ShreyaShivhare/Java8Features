package com.example.demo.predicate;

import java.util.function.*;
public class PredicateDemo {
	
	public static void main(String args[]) {
		
		//Normally
		PredicateDemo predicatedemo = new PredicateDemo();
		System.out.println(predicatedemo.testStringLength("Shreya Shivhare"));
		
		
		
		//Using FI
		Predicate<String> checkLength = s -> s.length() > 5;
		System.out.println("The length of string is greater than 5:" +checkLength.test("Shrey"));
		
		
	}

	public boolean testStringLength(String string) {
		if(string.length() > 5) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
