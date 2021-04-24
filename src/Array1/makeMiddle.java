/*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the
original array. The original array will be length 2 or more.
makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
makeMiddle([1]) → [1]
 */
package Array1;

import java.util.Arrays;

public class makeMiddle {
    public static void main(String[] args) {
        int[] array1={1, 2, 3, 4};
        int[] output1=makeMiddle(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={7, 1, 2, 3, 4, 9};
        int[] output2=makeMiddle(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={1, 2};
        int[] output3=makeMiddle(array3);
        System.out.println(Arrays.toString(output3));

        int[] array4={1};
        int[] output4=makeMiddle(array4);
        System.out.println(Arrays.toString(output4));
    }
    public static int[] makeMiddle(int[] nums) {
        if ((nums.length>2))
            return new int[]{nums[nums.length/2-1],nums[nums.length/2+1]};
        else
            return nums;
    }
}
