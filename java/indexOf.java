class indexOf {
  /*
   * Index Of
   * 
   * Given an array of integers and a target value, return the index of the first
   * element that matches the target value. If there are no matches, return -1.
   * 
   * Parameters Input: arr {Array of Integers} Input: target {Integer} Output:
   * {Integer}
   * 
   * Examples [1, 2, 3, 4, 5, 6], 5 --> 4 [9, 83, 74], 8 --> -1 [6, 4, 7, 9, 7, 8,
   * 2, 4, 3], 7 --> 2
   * 
   * Time Complexity: N Auxiliary Space Complexity: 1
   * 
   */
  public static void main(String args[]) {
    int[] test1Array = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int target = 5;
    System.out.println(target(test1Array, target));
  }

  public static int target(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return target;
      }
    }
    return -1;
  }
}