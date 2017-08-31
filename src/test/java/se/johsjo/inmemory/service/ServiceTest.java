package se.johsjo.inmemory.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import se.johsjo.inmemory.config.ConfigTest;
import se.johsjo.inmemory.model.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ConfigTest.class })
public class ServiceTest {

	private Service service;

	@Autowired
	ApplicationContext context;

	@Before
	public void setUp() {
		service = context.getBean(Service.class);
	}

	@Test
	public void testCreateAndRetrieve() {

		String fName = "firstNameTest";
		
		Person person = service.save(new Person(fName, "lastName"));

		System.out.println(person.toString());

		
		assertThat(person.getFirstName(),is(fName));

	}

}
