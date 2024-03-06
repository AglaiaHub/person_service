package telran.aglaia.personservice.service;

import telran.aglaia.personservice.dto.PersonDto;


public interface PersonService {
    Boolean addPerson (PersonDto personDto);
    PersonDto findPersonById (Integer id);
}
