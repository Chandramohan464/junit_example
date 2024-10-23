package com.example;

import java.util.regex.Pattern;

public class EmailValidator {
    String emailRegex="^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?$";

    public boolean isValidEmail(String email){
        return Pattern.matches(emailRegex, email);
    }
}
