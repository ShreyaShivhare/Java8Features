package com.example.demo.predicate;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<Integer,Integer> doubleIt =i -> 2*i;
		//System.out.println("Square is: "+square.apply(3));
		
		Function<Integer,Integer> cube =i -> i*i*i;
		//System.out.println("Cube is: "+cube.apply(2));

		System.out.println("Using 'andThen' :"+doubleIt.andThen(cube).apply(2));
		System.out.println("Using 'compose' :"+doubleIt.compose(cube).apply(2));
	}

}
