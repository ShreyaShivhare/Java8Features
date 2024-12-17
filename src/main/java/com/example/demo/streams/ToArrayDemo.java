package com.example.demo.streams;

import java.util.ArrayList;
import java.util.List;

public class ToArrayDemo {
	
	public static void main(String[] args) {
		
		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(250);
		arList.add(52);
		
		Object[] intArrOneLiner = arList.stream().filter(i -> i>=20).toArray();
		for(Object o : intArrOneLiner) {
			System.out.println("element in array is "+o);
		}
	}

}
