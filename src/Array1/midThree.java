/*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the
array. The array length will be at least 3.
midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */
package Array1;

import java.util.Arrays;

public class midThree {
    public static void main(String[] args) {
        int[] array1={1, 2, 3, 4, 5};
        int[] output1=midThree(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={8, 6, 7, 5, 3, 0, 9};
        int[] output2=midThree(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={1, 2, 3};
        int[] output3=midThree(array3);
        System.out.println(Arrays.toString(output3));
    }
    public static int[] midThree(int[] nums) {
        return new int[] {nums[nums.length/2-1], nums[nums.length/2], nums[nums.length/2+1]};
    }
}
