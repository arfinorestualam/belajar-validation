package pzn.belajarvalidation.helper;

import org.springframework.stereotype.Component;

@Component
public class StringHelper {

    public boolean isPallindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}
