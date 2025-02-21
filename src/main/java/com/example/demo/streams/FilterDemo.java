package com.example.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		
//		Stream s = arList.stream().filter(x -> x%2==0);
//		s.forEach(x -> System.out.println(x));
		
		arList.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
	}

}
