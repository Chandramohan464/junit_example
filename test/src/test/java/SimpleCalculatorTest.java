//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.SimpleCalculator;

public class SimpleCalculatorTest {
    
    @Test
    void addTest(){
        var calculator=new SimpleCalculator();
        assertTrue(calculator.add(2, 2)==4);
        assertEquals(4, calculator.add(2, 2));
    }
}
