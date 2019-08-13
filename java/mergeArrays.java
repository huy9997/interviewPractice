
/*
 * Merge Arrays
 * 
 * Given two sorted arrays of integers, return a merged sorted array of both
 * inputs.
 * 
 * Parameters Input: arr1 {Array of Integers} Input: arr2 {Array of Integers}
 * Output: {Array of Integers}
 * 
 * Examples [1, 3, 9], [2, 4, 8] --> [1, 2, 3, 4, 8, 9] [12, 25, 40], [20, 37,
 * 45] --> [12, 20, 25, 37, 40, 45] [10, 13, 24], [12, 35] --> [10, 12, 13, 24,
 * 35]
 * 
 * Time Complexity: M + N Auxiliary Space Complexity: M + N
 * 
 */

import java.util.*;

class mergeArrays {

  public static int[] mergeArraysFunction(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    int temp = 0;

    for (int i = 0; i < result.length; i++) {
      if (arr1[i] > arr2[i]) {
      } else {

      }
    }
    return result;
  }

  public static void main(String args[]) {
    int[] arr1 = { 1, 3, 9 };
    int[] arr2 = { 10, 20, 30 };
    int[] results = mergeArraysFunction(arr1, arr2);
    System.out.println("results");
    for (int i = 0; i < results.length; i++) {
      System.out.println(results[i]);

    }
  }
}