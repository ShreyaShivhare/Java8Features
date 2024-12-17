package com.example.demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(25);
		al.add(5);
		
		List<Integer> newAl = new ArrayList<Integer>();
		newAl = al.stream().filter(x -> x>=15).collect(Collectors.toList());
		newAl.stream().forEach(x -> System.out.println(x));

	
//		List<Integer> arrayList = findElement(al);
//		for(Integer i : arrayList) {
//			System.out.println(i);
//		}
//	}
//
//	public static List<Integer> findElement(List<Integer> al) {
//		List<Integer> newAl = new ArrayList<>();
//		for(Integer i: newAl) {
//			if(i>=15) {
//				newAl.add(i);
//			}
//		}
//		return newAl;
//	}
	}		

}
