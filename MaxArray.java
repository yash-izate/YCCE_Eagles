public class MaxArray {
  public static void main(String[] args) {

    int[] nums = { 11, 2, 1, 0, 12, 13, 22};

    int temp = nums[0];

    for (int ele : nums) {
      if (ele > temp) {
        temp = ele;

      }
    }

    System.out.println("Max element: " + temp);

  }
}