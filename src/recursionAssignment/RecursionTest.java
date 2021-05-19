package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

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
    public void CountHiTest1() { // a char that isn't hi
      assertEquals(0, Recursion.countHi("x"));
    }

    @Test
    public void CountHiTest2() { // hi at beginning, middle, and end
      assertEquals(3, Recursion.countHi("hixhixhi"));
    }

     @Test
    public void CountHiTest3() { // only hi
      assertEquals(1, Recursion.countHi("hi"));
    }

    @Test
    public void CountHiTest4() { // empty string
      assertEquals(0, Recursion.countHi(""));
    }

    @Test
    public void CountHiTest5() { // testing upper and lower cases
      assertEquals(0, Recursion.countHi("HIxhIxHi"));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
