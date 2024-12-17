package com.example.demo.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,3,7,4,2,1,3);
		
		Optional<Integer> optional = numbers.stream().distinct().sorted((a,b) -> b-a).skip(1).findFirst();
		
		Integer secondHighest = optional.get();
		System.out.println(secondHighest);
		

	}

}
