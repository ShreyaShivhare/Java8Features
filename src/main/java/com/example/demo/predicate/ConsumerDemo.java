package com.example.demo.predicate;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> squareIt = i -> System.out.println("Taking an input and performing operation and return nothing: "+2*i);;
		squareIt.accept(5);

	}

}
