package recursionAssignment;

public class Recursion{
  public static int countHi(String str) {
    if(str.length() < 2) { // base case
		 return 0;
    }

	  if(str.charAt(0) == 'h' && str.charAt(1) == 'i') { // recursive case
  		return 1 + countHi(str.substring(2));
    }
	  return countHi(str.substring(1));  
  }

  public static String changePi(String str) {
    if (str.length() < 2) { // base case
      return str;
    }
    
    if (str.substring(0, 2).equals("pi")) { // recursive case
      return "3.14" + Recursion.changePi(str.substring(2)); 
    }
    return str.charAt(0) + Recursion.changePi(str.substring(1));
  }
}
