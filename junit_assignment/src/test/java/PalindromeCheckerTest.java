import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.*;

public class PalindromeCheckerTest {

    private final PalindromeChecker checker = new PalindromeChecker();

    @ParameterizedTest
    @CsvSource({
        "'madam', true",
        "'racecar', true",
        "'hello', false",
        "'A man a plan a canal Panama', true",
        "'', true",
        "' ', true",
        "null, false" 
    })
    public void testIsPalindrome(String input, boolean expected) {
        assertEquals(expected, checker.isPalindrome(input));
    }
}

