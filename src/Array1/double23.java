/*Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */
package Array1;

import java.util.Arrays;

public class double23 {
    public static void main(String[] args) {
        int[] array1={2, 2};
        boolean output1=double23(array1);
        System.out.println(output1);

        int[] array2={3, 3};
        boolean output2=double23(array2);
        System.out.println(output2);

        int[] array3={2, 3};
        boolean output3=double23(array3);
        System.out.println(output3);
    }
    public static boolean double23(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (((nums[i]==2) && (nums[i+1]==2)) || ((nums[i]==3) && (nums[i+1])==3))
                return  true;
        }
        return false;
    }
}
