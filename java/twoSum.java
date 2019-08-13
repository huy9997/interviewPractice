import java.util.*;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
class twoSum {

  public static int[] twoSumFunction(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] arr = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int searchSecond = (target - nums[i]);
      System.out.println(i + " " + nums[i]);
      if (map.containsKey(searchSecond)) {
        arr[0] = map.get(searchSecond);
        arr[1] = i;
      }
      map.put(nums[i], i);
    }
    return arr;
  }

  public static void main(String args[]) {
    int num[] = { 2, 3, 7, 15 };
    int target = 9;
    int results[] = twoSumFunction(num, target);

    System.out.println(results[0] + " " + results[1]);
  }

}