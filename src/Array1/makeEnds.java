/*Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.
makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
 */
package Array1;

import java.util.Arrays;

public class makeEnds {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int[] output1=makeEnds(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={1, 2, 3, 4};
        int[] output2=makeEnds(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={7, 4, 6, 2};
        int[] output3=makeEnds(array3);
        System.out.println(Arrays.toString(output3));
    }
    public static int[] makeEnds(int[] nums) {
        return  new int[]{nums[0],nums[nums.length-1]};
    }
}
