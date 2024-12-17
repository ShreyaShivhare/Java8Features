package com.example.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountDemo {
	
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(25);
		arList.add(52);
		
		long countDemo = arList.stream().count();
		System.out.println(countDemo);
		
	}
}
