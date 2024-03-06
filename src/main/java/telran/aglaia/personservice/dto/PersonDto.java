package telran.aglaia.personservice.dto;

import lombok.Getter;
import telran.aglaia.personservice.model.Address;

import java.time.LocalDate;

@Getter
public class PersonDto {
    Integer id;
    String name;
    LocalDate birthDate;
    Address address;
}
