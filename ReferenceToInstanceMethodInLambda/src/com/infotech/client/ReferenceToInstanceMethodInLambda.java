package com.infotech.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.infotech.model.Person;

public class ReferenceToInstanceMethodInLambda {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Henry", 45));
		persons.add(new Person("Kishan", 25));
		persons.add(new Person("Raj", 21));
		persons.add(new Person("Mohan", 65));
		
		List<String> personNames = ReferenceToInstanceMethodInLambda.getPersonNames(persons,Person::getName);
		personNames.forEach(System.out::println);
	}

	private static List<String> getPersonNames(List<Person> persons, Function<Person, String> f) {
		List<String> results = new ArrayList<>();
		persons.forEach(n->results.add(f.apply(n)));
		return results;
	}

}
