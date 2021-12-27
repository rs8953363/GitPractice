/*Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */
package Array2;

import java.util.ArrayList;
import java.util.Arrays;

public class no14 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        boolean output1=no14(array1);
        System.out.println(output1);

        int[] array2={1, 2, 3, 4};
        boolean output2=no14(array2);
        System.out.println(output2);

        int[] array3={2, 3, 4};
        boolean output3=no14(array3);
        System.out.println(output3);
    }

    public static boolean no14(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            if (!((nums[i]==1) && (nums[i]==4)))
                return false;
        }
        return true;

        /*ArrayList<Integer> arrList= new ArrayList<>(nums.length);
        for (int i: nums) {
            arrList.add(i);
        }
        if (arrList.contains(1) && arrList.contains(4)){
            return false;
        }
        return true;
        */

    }
}
