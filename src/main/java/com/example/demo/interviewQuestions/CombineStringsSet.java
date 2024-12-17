package com.example.demo.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineStringsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> skills =Arrays.asList(Arrays.asList("Java", "SpringBoot","SQL"),Arrays.asList("React","Angular"));
		
		List<String> allskills = skills.stream().flatMap(skillsList -> skillsList.stream()).collect(Collectors.toList());
		System.out.println(allskills);
		
		List<String> skillStartWithS = allskills.stream().filter(skill -> skill.startsWith("S")).collect(Collectors.toList());
		System.out.println(skillStartWithS);
	}

}
