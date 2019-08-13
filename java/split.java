
/*
 * Split
 * 
 * Given a string of characters, return an array with each character separated
 * into its own separate item.
 * 
 * Parameters Input: str {String} Output: {Array of Characters}
 * 
 * Examples 'hello' --> ['h', 'e', 'l', 'l', 'o'] 'foo' --> ['f', 'o'. 'o']
 * 
 * Time Complexity: N Auxiliary Space Complexity: N
 * 
 */

import java.util.*;

class split {

  public static ArrayList splitFunction(String string) {
    ArrayList<Character> results = new ArrayList<>();
    for (int i = 0; i < string.length(); i++) {
      results.add(string.charAt(i));
    }
    return results;
  }

  public static void main(String args[]) {
    String test = "testing";
    System.out.println(splitFunction(test));
  }
}