package pzn.belajarvalidation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pzn.belajarvalidation.validation.Palindrome;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fufufafa {

    @Palindrome
    private String barbar;
}
