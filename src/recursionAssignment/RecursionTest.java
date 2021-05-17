package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * An initial test
     */
    @Test
    public void Test1() { // a char that isn't hi
      assertEquals(0, Recursion.countHi("x"));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
