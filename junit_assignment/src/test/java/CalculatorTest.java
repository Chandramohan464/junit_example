import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.*;

public class CalculatorTest {
    Calculator calculate=new Calculator();
    
    @ParameterizedTest
    @CsvSource({
        "2, 3, 6",       
        "-2, 3, -6",     
        "0, 5, 0",       
        "7, 0, 0",       
        "-2, -3, 6",     
        "100, 200, 20000" 
    })
    public void testAddition(int a, int b, int expected) {
        assertEquals(expected, calculate.multiply(a,b));
    }
}
