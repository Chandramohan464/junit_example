import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.Calculator;

public class MyTest {
    
    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator=new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void testSub(){
        assertEquals(-1, calculator.sub(2, 3));
    }

    @Test
    public void testMul(){
        assertEquals(6, calculator.mul(2, 3));
    }

    @Test
    public void testDiv(){
        assertEquals(1, calculator.div(2, 2));
    }
}
