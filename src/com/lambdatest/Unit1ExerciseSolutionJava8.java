package com.lambdatest;

import java.util.*;


public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Jim", "Smith", 41),
				new Person("Gavin", "Drake", 27),
				new Person("Breanne", "Smith", 40),
				new Person("John", "Carrey", 33)
				);

	
	// sort the list
	Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
	//printAll(people);
	
	printConditionally(people, p -> p.getLastName().startsWith("S"));
	

	}

	private static void printAll(List<Person> people) {
		for(Person person : people) {
			System.out.println(person);
		}
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
	}
}

interface Condition {
	
	boolean test(Person p);
}
