package pzn.belajarvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pzn.belajarvalidation.properties.DatabaseProperties;

@EnableConfigurationProperties({
        DatabaseProperties.class
})
@SpringBootApplication
public class BelajarValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BelajarValidationApplication.class, args);
    }

}
//kalo di application.properties tidak di tambahkan data username, password
//maka akan dihentikan aplikasinya, error, karena username dan password null
//padahal di classnya, sudah diberi annotation @NotBlank
