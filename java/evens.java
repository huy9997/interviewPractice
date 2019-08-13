
/*
 * Evens
 * 
 * Given an array of integers, return an array of only the even values.
 * 
 * Parameters Input: arr {Array of Integers} Output: {ArrayList of Integers}
 * 
 * Examples [1, 2, 3, 4, 5, 6] --> [2, 4, 6] [9, 83, 74] --> [74] [6, 4, 7, 9,
 * 7, 8, 2, 4, 3] --> [6, 4, 8, 2, 4]
 * 
 * Time Complexity: N Auxiliary Space Complexity: N
 * 
 */

import java.util.*;

class evens {

  public static ArrayList evensFunction(int[] arr) {
    int n = arr.length;
    ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        arrayList.add(arr[i]);
      }
    }
    return arrayList;
  }

  public static void main(String args[]) {
    int[] test1 = { 1, 2, 3, 4, 5, 6 };
    System.out.print(evensFunction(test1));
  }

}