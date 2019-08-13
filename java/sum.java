
/*
 * Sum
 * 
 * Given an array of integers, return the sum of all the integers.
 * 
 * Parameters Input: arr {Array of Integers} Output: {Integer}
 * 
 * Examples [1, 2, 3, 4, 5] --> 15 [0, 1, -1] --> 0 [] --> 0
 * 
 * Time Complexity: N Auxiliary Space Complexity: 1
 * 
 */
import java.util.*;

class sum {
  public static int sumFunction(int[] testValues) {
    int result = 0;
    for (int i = 0; i < testValues.length; i++) {
      result = result + testValues[i];
    }
    return result;
  }

  public static void main(String args[]) {
    int[] test = { 1, 2, 3, 4 };
    System.out.println(sumFunction(test));
  }
}