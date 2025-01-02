public class ArrayOcc {
  public static void main(String[] args) {
    
    int res = 0;
    int[] nums = {2,3,4,5,2,3,4};

    res = nums[0];

    for(int i = 1; i<nums.length; i++){

      res = res ^ nums[i];
    }

    System.out.println("Unique element is " + res);

    for(int ele:nums) {
      System.out.print(ele + " ");

    }

  }
}
