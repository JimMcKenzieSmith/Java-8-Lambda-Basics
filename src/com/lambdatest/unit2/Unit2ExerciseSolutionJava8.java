package com.lambdatest.unit2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambdatest.unit1.Person;


public class Unit2ExerciseSolutionJava8 {

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
	performConditionally(people, p -> true, p -> System.out.println(p));
	
	performConditionally(people, p -> p.getLastName().startsWith("S"), p -> System.out.println(p));
	

	}

	
	private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for(Person person : people) {
			if(condition.test(person)) {
				consumer.accept(person);
			}
		}
	}
}


