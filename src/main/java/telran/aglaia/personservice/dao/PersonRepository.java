package telran.aglaia.personservice.dao;

import org.springframework.data.repository.CrudRepository;
import telran.aglaia.personservice.dto.PersonDto;
import telran.aglaia.personservice.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
