package com.example.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CollectDemo {
	public static void main(String[] args) {
		
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(250);
		arList.add(52);
		
		List<Integer> collectdemo = arList.stream().filter(i -> i >= 20).collect(Collectors.toList());
		collectdemo.forEach(x -> System.out.println(x));
		
	}

}
