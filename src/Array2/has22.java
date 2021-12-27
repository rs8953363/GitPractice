/*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */
package Array2;

import java.util.Arrays;

public class has22 {
    public static void main(String[] args) {
        int[] array1={1, 2, 2};
        boolean output1=has22(array1);
        System.out.println(output1);

        int[] array2={1, 2, 1, 2};
        boolean output2=has22(array2);
        System.out.println(output2);

        int[] array3={2, 1, 2};
        boolean output3=has22(array3);
        System.out.println(output3);
    }

    public static boolean has22 (int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i]==2) && (nums[i+1]==2))
                return true;
        }
        return false;
    }
}
