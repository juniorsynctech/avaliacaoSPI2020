package apirestfullspi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import apirestfullspi.domain.Person;
import apirestfullspi.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Person newPerson(Person person) {
		
		return personRepository.save(person);
	}
	
	public List<Person> ALLPerson() {
		
		return personRepository.findAll();
	}
	
	public Person findOnePerson(long id) {
		
		return personRepository.getOne(id);
		
	}
	
	public Person alterPerson(Person person) {
		
		return personRepository.save(person);
	}
	
	public void deletePerson (long id) {
		
		personRepository.deleteById(id);
		
	}
}
