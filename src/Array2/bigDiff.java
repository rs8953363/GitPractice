/*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 */
package Array2;

import java.util.Arrays;

public class bigDiff {
    public static void main(String[] args) {
    int[] array1={10, 3, 5, 6};
    int output1=bigDiff(array1);
    System.out.println(output1);

    int[] array2={7, 2, 10, 9};
    int output2=bigDiff(array2);
    System.out.println(output2);

    int[] arrays3={2, 10, 7, 2};
    int output3=bigDiff(arrays3);
    System.out.println(output3);
    }

    public static int bigDiff(int[] nums) {
        /*
        int min=nums[0];
        int max=nums[nums.length-1];
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min)
                min=nums[i];
            if (nums[i]>max)
                max=nums[i];
            result=max-min;
        }
        return result;
        */
        int result=0;
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++) {
            result=nums[nums.length-1]-nums[0];
        }
        return result;
    }
}
