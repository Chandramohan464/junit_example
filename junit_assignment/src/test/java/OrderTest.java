import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;

import com.example.*;

public class OrderTest {
    
    @Test
    public void testCalculateTotalPrice() {
        Product product1 = new Product("Shampoo", 10.0, 3); 
        Product product2 = new Product("T-Shirt", 299.99, 2);  

        Order order = new Order(Arrays.asList(product1, product2));

        double expectedTotal = 629.98;
        assertEquals(expectedTotal, order.calculateTotalPrice());
    }

    @Test
    public void testEmptyOrderTotalPrice() {
        Order order = new Order(Collections.emptyList());

        double expectedTotal = 0.0;
        assertEquals(expectedTotal, order.calculateTotalPrice());
    }
}
