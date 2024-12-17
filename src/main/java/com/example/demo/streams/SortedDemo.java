package com.example.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
	
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(250);
		arList.add(52);
		
		Stream<Integer> newSortedlist = arList.stream().sorted();
		newSortedlist.forEach(x -> System.out.println(x));
	}

}
