package pzn.belajarvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pzn.belajarvalidation.data.Fufufafa;

import java.util.Set;

@SpringBootTest
public class PalindromeTest {

    @Autowired
    private Validator validator;

    @Test
    void palindromeValid() {
        Set<ConstraintViolation<Fufufafa>> constraintViolations = validator.validate(new Fufufafa("kodok"));
        Assertions.assertTrue(constraintViolations.isEmpty());
    }

    @Test
    void palindromeInvalid() {
        Set<ConstraintViolation<Fufufafa>> constraintViolations = validator.validate(new Fufufafa("fufufafa"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());
    }
}
