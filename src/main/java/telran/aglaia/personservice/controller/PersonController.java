package telran.aglaia.personservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import telran.aglaia.personservice.dto.PersonDto;
import telran.aglaia.personservice.service.PersonService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    final PersonService personService;

    @PostMapping
    public Boolean addPerson(@RequestBody PersonDto personDto){
        return personService.addPerson(personDto);
    }

    @GetMapping("/{id}")
    public PersonDto findPersonById(@PathVariable Integer id) {
        return personService.findPersonById(id);
    }
}
