package ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ms.entities.Person;
import ms.repository.PersonRepository;

@RequestMapping("/person")
@RestController
public class PersonController {
	
	
	@Autowired
	PersonRepository postRepository;


	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> getPostById(@PathVariable Integer id)  {
		
		Person person = postRepository.getPersonById(id);
		return ResponseEntity.status(HttpStatus.OK).body(person);
	}
	
	
	
	
}
