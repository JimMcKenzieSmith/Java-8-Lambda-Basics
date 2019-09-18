package com.lambdatest.unit1;

import java.util.*;
import java.util.function.Predicate;


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
	System.out.println("All:");
	printConditionally(people, p -> true);
	
	System.out.println("Starts with S:");
	printConditionally(people, p -> p.getLastName().startsWith("S"));
	

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


