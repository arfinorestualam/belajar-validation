package pzn.belajarvalidation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

//annotation untuk validation method secara otomatis
@Validated
@Component
public class SayHello {

    public String sayHello(@NotBlank String name) {
        return "Hello " + name;
    }
}
