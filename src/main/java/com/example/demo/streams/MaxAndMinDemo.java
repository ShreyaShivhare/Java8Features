package com.example.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxAndMinDemo {
	
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(250);
		arList.add(52);
		
		Integer minvalue = arList.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(minvalue);
		
		Integer maxvalue = arList.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(maxvalue);
	}

}
