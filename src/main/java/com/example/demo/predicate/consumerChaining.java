package com.example.demo.predicate;

import java.util.function.Consumer;

public class consumerChaining {
	
	public static void main(String args[]) {
		
		Consumer<Integer> squareIt = i -> System.out.println("Taking an input and performing operation and return nothing: "+i*i);;
		squareIt.accept(5);
		
		Consumer<Integer> doubleMe = i -> System.out.println("Taking an input and performing operation and return nothing: "+2*i);;
		doubleMe.accept(5);
		
		squareIt.andThen(doubleMe).accept(4);
		
		//It donot have any compose method
	}

}
