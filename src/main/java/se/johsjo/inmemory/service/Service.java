package se.johsjo.inmemory.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import se.johsjo.inmemory.model.Person;
import se.johsjo.inmemory.repository.Repository;

@Component
public class Service {

	@Autowired
	Repository repository;
	
	
	public Collection<Person> getAllPersons(){
		return repository.findAll();
	}
	
	public Person save(Person person){
		return repository.save(person);
	}
}
