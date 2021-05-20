package recursionAssignment;

public class Recursion{

  /**
  * Problem Set 1: countHi
  * author: @Douglas Lau
  */

  public static int countHi(String str) {
    if(str.length() < 2) { // base case
		 return 0;
    }

	  if(str.charAt(0) == 'h' && str.charAt(1) == 'i') { // recursive case
  		return 1 + countHi(str.substring(2));
    }
	  return countHi(str.substring(1));  
  }

  /**
  * Problem Set 2: changePi
  * author: @Douglas Lau
  */

  public static String changePi(String str) {
    if (str.length() < 2) { // base case
      return str;

    } else if (str.charAt(0) == 'p' && str.charAt(1) == 'i') { // recursive case
      return "3.14" + Recursion.changePi(str.substring(2)); 

    } else
      return str.charAt(0) + Recursion.changePi(str.substring(1));
  }

  /**
  * Problem Set 3: array220
  * author: @Douglas Lau
  */
  
  public static boolean array220(int[] intNums, int index) {
  }
}
