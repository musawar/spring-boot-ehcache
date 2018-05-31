package ms.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import ms.entities.Person;

@Repository
public class PersonRepository {

	private static final Logger log = LoggerFactory.getLogger(PersonRepository.class);
	
	@Cacheable(value= "GetPersonId", key="#id", unless="#result==null")
	public Person getPersonById(int id)  {
		log.info("Looking for Person with id:"+id+" - Cache will be maintained");
		return new Person(id, "Fake Person");
	}

}
