package recursionAssignment;

public class Recursion{
  public static int countHi(String str) {
    if(str.length() < 2) { // base case
		 return 0;
    }
    
    return countHi(str.substring(1));
  }
}
