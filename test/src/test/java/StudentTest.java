import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.Student;

public class StudentTest {
    
    Student student;

    @BeforeEach
    public void setUp(){
        student=new Student();
    }

    @Test
    public void testAdd(){
        student.add("Mahesh");
        student.add("Shubam");
        student.add("Ashish");
        student.add("Venkatesh");
        assertEquals(4, student.sizeOfStudent(), "Adding 4 student to list");
    }

    @Test  
    public void testRemove() {  
        student.add("Antonio");  
        student.add("Paul");  
        student.remove("Paul");  
        assertEquals(1, student.sizeOfStudent(),"Removing 1 student from list");  
    }  
      
    @Test  
    public void removeAll() {  
        student.removeAll();  
    }  
}
