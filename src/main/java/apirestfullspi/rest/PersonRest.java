package apirestfullspi.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import apirestfullspi.domain.Person;
import apirestfullspi.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonRest {
	
	@Autowired
	public PersonService personService;
	
	@PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {

		person = personService.newPerson(person);

        return ResponseEntity.ok().body(person);
    }
	
	@PutMapping("/person")
	public void alterPerson(@RequestBody Person Person) {
				
		personService.newPerson(Person);				
	}
	
	@GetMapping("/person/all")
	public List<Person> allPersons() {
		
		return personService.ALLPerson();
	}
	
	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable long id) {
		
		return personService.findOnePerson(id);
	}		
	
	@DeleteMapping("/person/{id}")
	public void deletePerson(@PathVariable long id) {
		
		personService.deletePerson(id);
	}

}
