package telran.aglaia.personservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address implements Serializable {
    String city;
    String street;
    Integer building;

}
