package pzn.belajarvalidation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import pzn.belajarvalidation.helper.StringHelper;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return stringHelper.isPallindrome(s);
    }
}
