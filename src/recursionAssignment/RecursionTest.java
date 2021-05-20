package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

/**
* The class RecursionTest will hold all the tests for problem sets 1, 2, and 3
* author: @Douglas Lau
*/

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * Problem Set 1: CountHi Tests
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
    public void CountHiTest3() { // only hi & test3 from md file
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

    @Test
    public void CountHiTest6() { // test1 from md file
      assertEquals(1, Recursion.countHi("xxhixx"));
    }

    @Test
    public void CountHiTest7() { // test2 from md file
      assertEquals(2, Recursion.countHi("xhixhix"));
    }

    /**
    * Problem Set 2: ChangePi Tests
    */

    @Test
    public void ChangePiTest1() { // only pi
      assertEquals("3.14", Recursion.changePi("pi"));
    }

    @Test
    public void ChangePiTest2() { // a char that isn't pi
      assertEquals("x", Recursion.changePi("x"));
    }

    @Test
    public void ChangePiTest3() { // in at beginning, middle, and end
      assertEquals("3.14x3.14x3.14", Recursion.changePi("pixpixpi"));
    }

    @Test
    public void ChangePiTest4() { // empty string
      assertEquals("", Recursion.changePi(""));
    }

    @Test
    public void ChangePiTest5() { // test1 from md file
      assertEquals("x3.14x", Recursion.changePi("xpix"));
    }

    @Test
    public void ChangePiTest6() { // test2 from md file
      assertEquals("3.143.14", Recursion.changePi("pipi"));
    }

    @Test
    public void ChangePiTest7() { // test3 from md file
      assertEquals("3.14p", Recursion.changePi("pip"));
    }

    /**
    * Problem Set 3: array220 Tests
    */

    @Test
    public void array220Test1() { // test1 from md file
      assertEquals(true, Recursion.array220(new int[] {1, 2, 20}, 0));
    }

    @Test
    public void array220Test2() { //test2 from md file
      assertEquals(false, Recursion.array220(new int[] {3}, 0));
    }

    @Test
    public void array220Test3(){ // test3 from md file
      assertEquals(true, Recursion.array220(new int[] {3, 30}, 0));
    }

    @Test
    public void array220Test4(){ // empty array
      assertEquals(false, Recursion.array220(new int[] {}, 0));
    }

    @Test
    public void array220Test5(){ // only 0 in array
      assertEquals(false, Recursion.array220(new int[] {0}, 0));
    }

    @Test
    public void array220Test6(){ // spaced apart
      assertEquals(false, Recursion.array220(new int[] {2, 3, 20, 5}, 0));
    }

    @Test
    public void array220Test7(){ // found in the beginning, middle, and end
      assertEquals(true, Recursion.array220(new int[] {1, 10, 2, 3, 30, 4, 5, 50}, 0));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
