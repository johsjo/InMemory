package se.johsjo.inmemory;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import se.johsjo.inmemory.model.Person;
import se.johsjo.inmemory.service.Service;

@SpringBootApplication
public class InMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InMemoryApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(ApplicationContext context){
		return args -> {
			
			Service service = context.getBean(Service.class);
			service.save(new Person("firstName", "lastName"));
			service.getAllPersons().forEach(p -> System.out.println(p.toString()));
			
			
		};
	}
}
