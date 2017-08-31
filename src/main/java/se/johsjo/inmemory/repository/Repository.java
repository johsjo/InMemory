package se.johsjo.inmemory.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import se.johsjo.inmemory.model.Person;

public interface Repository extends CrudRepository<Person, Long>{

	Collection<Person> findAll();
	
}
