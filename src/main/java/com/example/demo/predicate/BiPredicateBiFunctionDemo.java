package com.example.demo.predicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> checkSumoftwo = (a,b) -> a+b >= 5 ;
		System.out.println("The sum of 2 and 5 is greater tha 5: "+checkSumoftwo.test(2, 5));
		System.out.println("The sum of 2 and 1 is greater tha 5: "+checkSumoftwo.test(2, 1));
		
		BiFunction<Integer,Integer, Integer> multiplyboth = (a,b) -> a*b ;
		System.out.println("Multiplication of 2 and 5: "+multiplyboth.apply(2, 5));

	}
	//only at most 2 arguments are accepted . there is no concept like TriPredicate or quadPredicate.

}
