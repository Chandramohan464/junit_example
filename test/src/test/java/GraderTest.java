import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.Grader;

public class GraderTest {
    
    @Test
    void fiftyNineReturnsF(){
        Grader grader=new Grader();
        assertEquals('F', grader.grade(59));
    }

    @Test
    void sixtyNineReturnsD(){
        Grader grader=new Grader();
        assertEquals('D', grader.grade(69));
    }

    @Test
    void seventNineReturnsC(){
        Grader grader=new Grader();
        assertEquals('C', grader.grade(79));
    }

    @Test
    void eightyNineReturnsB(){
        Grader grader=new Grader();
        assertEquals('B', grader.grade(89));
    }

    @Test
    void nintyNineReturnsA(){
        Grader grader=new Grader();
        assertEquals('A', grader.grade(99));
    }

    @Test
    void negativeOneReturnsIllegalArgumentException(){
        Grader grader=new Grader();
        assertThrows(IllegalArgumentException.class, () -> {grader.grade(-1);});
    }
}
