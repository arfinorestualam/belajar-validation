package pzn.belajarvalidation;

import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pzn.belajarvalidation.helper.SayHello;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess() {
        String sayHello = this.sayHello.sayHello("blank");
        Assertions.assertEquals("Hello blank", sayHello);
    }

    @Test
    void testFail() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> sayHello.sayHello(""));
    }
}
