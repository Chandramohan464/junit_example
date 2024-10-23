import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.*;

public class EmailValidatorTest {
    EmailValidator validator=new EmailValidator();

    @ParameterizedTest
    @ValueSource(strings = {
        "abc@yahoo.com",
        "abc-100@yahoo.com",
        "abc.100@yahoo.com",
        "abc111@abc.com",
        "abc-100@abc.net",
        "abc.100@abc.com.au",
        "abc@1.com",
        "abc@gmail.com.com",
        "abc+100@gmail.com",
        "abc",
        "abc@.com.my",
        "abc123@gmail.a",
        "abc123@.com",
        "abc123@.com.com",
        "abc()@gmail.com",
        ".abc@abc.com",
        "abc..2002@gmail.com",
        "abc.@gmail.com",
        "abc@abc@gmail.com",
        "abc@gmail.com.la",
        "abc@gmail.com.aa.au"                     
    })
    void testIsValidEmail(String email) {
        boolean result = validator.isValidEmail(email);
        if (validator.isValidEmail(email)) {
            assertTrue(result, email + " should be valid");
        } else {
            assertFalse(result, email + " should be invalid");
        }
    }
}
