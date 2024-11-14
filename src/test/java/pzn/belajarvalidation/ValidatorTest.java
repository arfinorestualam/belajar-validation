package pzn.belajarvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pzn.belajarvalidation.data.Person;

import java.util.Set;

@SpringBootTest
public class ValidatorTest {

    @Autowired
    private Validator validator;

    @Test
    void personNotValid() {
        var person = new Person("", "");

        Set<ConstraintViolation<Person>> personValidations = validator.validate(person);
        Assertions.assertFalse(personValidations.isEmpty());
        Assertions.assertEquals(2, personValidations.size());
    }

    @Test
    void personValid() {
        var person = new Person("1", "fin");

        Set<ConstraintViolation<Person>> personValidations = validator.validate(person);
        Assertions.assertTrue(personValidations.isEmpty());
    }
}
