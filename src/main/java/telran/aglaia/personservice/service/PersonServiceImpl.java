package telran.aglaia.personservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import telran.aglaia.personservice.dao.PersonRepository;
import telran.aglaia.personservice.dto.PersonDto;
import telran.aglaia.personservice.dto.exceptions.PersonNotFoundException;
import telran.aglaia.personservice.model.Person;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{
    final PersonRepository personRepository;
    final ModelMapper modelMapper;

    @Override
    public Boolean addPerson(PersonDto personDto){
        if(personRepository.existsById(personDto.getId())){
            return false;
        }
        personRepository.save(modelMapper.map(personDto, Person.class));
        return true;
    }

    @Override
    public PersonDto findPersonById(Integer id) {
        Person person = personRepository.findById(id).orElseThrow(PersonNotFoundException::new);
        return modelMapper.map(person, PersonDto.class);
    }
}
