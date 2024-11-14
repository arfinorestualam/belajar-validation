package pzn.belajarvalidation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

//tambahkan @validated agar tidak ada konflik, dan juga annotation notblank
@Validated
public interface ISayHello {

    String sayHello(@NotBlank String name);
}
