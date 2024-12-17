package com.example.demo.streams;

import java.util.stream.Stream;
/*
 * Stream concept is not only applicable for collections it's also applicable for "ANY GROUP OF VALUE"
 * Stream.of() this method can take any group of values and convert them to stream so that multiple 
 * stream operations can be applied to it.
 * */
public class OfDemo {
	
	public static void main(String[] args) {
		
		Stream.of(1,11,111,1111,11111).forEach(x -> System.out.println(x));
		
		String[] name = {"Shreya", "shivhare", "Demo"};
		Stream.of(name).filter(x -> x.length() > 4).forEach(x -> System.out.println(x));
	}

}
