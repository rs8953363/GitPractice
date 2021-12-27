/*Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2,
use whatever elements are present.
frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */
package Array1;

import java.util.Arrays;

public class frontPiece {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int[] output1=frontPiece(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={1, 2};
        int[] output2=frontPiece(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={1};
        int[] output3=frontPiece(array3);
        System.out.println(Arrays.toString(output3));

    }

    public static int[] frontPiece(int[] nums) {
        if ((nums.length>1))
            return new int[]{nums[0],nums[1]};
        else
            return nums;
    }
}
