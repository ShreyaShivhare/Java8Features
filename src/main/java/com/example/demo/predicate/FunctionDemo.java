package com.example.demo.predicate;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		FunctionDemo functionDemo = new FunctionDemo();
		System.out.println("Square of 6 is: "+functionDemo.checkSquare(6));
		
		Function<Integer, Integer> checkSquare = i -> i*i;
		System.out.println("The square is: "+checkSquare.apply(5));

	}

	public int checkSquare(int i) {
		int square = i*i;
		return square;
		
		
	}

}
