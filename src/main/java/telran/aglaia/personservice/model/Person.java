package telran.aglaia.personservice.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "persons")
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 123456789L;        //TODO ИЗУЧИТЬ ЧТО ТАКОЕ СЕРИАЛАЙЗЕБЛ
    @Id
    Integer id;
    @Setter
    String name;
    LocalDate birthDate;
    @Setter
    @Embedded
    Address address;
}
