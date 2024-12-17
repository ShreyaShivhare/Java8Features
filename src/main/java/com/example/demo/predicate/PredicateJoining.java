package com.example.demo.predicate;

import java.util.function.Predicate;

public class PredicateJoining {
	
	public static void main(String args[]) {
		
		Predicate<String> checkLength = s -> s.length()>=5;
		System.out.println("The length is greater then 5: "+checkLength.test("Code decode"));
		
		Predicate<String> checkEvenlength= s -> s.length() %2 ==0;
		System.out.println("The length is greater then 5: "+checkEvenlength.test("Code decode"));
		
		System.out.println("After merging with and: "+checkEvenlength.and(checkLength).test("Code decode"));
		
		System.out.println("After merging with or: "+checkLength.or(checkEvenlength).test("Code Decode"));
		
		System.out.println("After doing negate: " +checkEvenlength.negate().test("Code Decode"));
		
		
	}

}
