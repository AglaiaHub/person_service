package telran.aglaia.personservice.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException  extends RuntimeException{

    //serialVersionUID - надо или нет
}
