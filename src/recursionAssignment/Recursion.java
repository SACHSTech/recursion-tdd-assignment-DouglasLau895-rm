package recursionAssignment;

/**
* This Recursion class will hold the methods for Problem Set 1, 2, and 3
* @author: Douglas Lau
*/

public class Recursion{

  /**
  * Problem Set 1: countHi
  * A method that returns the number of "hi"s within a given string
  * @param str (The Input String)
  * @return an int representing number of 'hi'
  * @author: Douglas Lau
  */

  public static int countHi(String str) {
    if (str.length() < 2) { // base case
		 return 0;
    }

	  if (str.substring(0, 2).equals("hi")) { // recursive case
  		return 1 + countHi(str.substring(2));
    }
	  return countHi(str.substring(1));  
  }

  /**
  * Problem Set 2: changePi
  * A program that changes all "pi" to 3.14
  * @param str (The Input String)
  * @return a string with all "pi" replaced with "3.14"
  * @author: Douglas Lau
  */

  public static String changePi(String str) {
    if (str.length() < 2) { // base case
      return str;

    } else if (str.substring(0, 2).equals("pi")) { // recursive case
      return "3.14" + Recursion.changePi(str.substring(2)); 

    } else
      return str.charAt(0) + Recursion.changePi(str.substring(1));
  }

  /**
  * Problem Set 3: array220
  * A program that returns true when the next number in the array is 10 times of the previous number
  * @param intNums (Input Array), index (Input Index)
  * @return true if the next number in the array is 10 times the previous number
  * @author: Douglas Lau
  */
  
  public static boolean array220(int[] intNums, int index) {
    if (index == intNums.length - 1 || intNums.length == 0) { // base cases
      return false;
    }

    if (intNums[index] * 10 == intNums[index + 1] || array220(intNums, index + 1)) { // recursive case
      return true;
    }  

    return false;
  }
}
