/* Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
Return the changed array.
fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
 */
package Array1;

import java.util.Arrays;

public class fix23 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int[] output1=fix23(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={2, 3, 5};
        int[] output2=fix23(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={1, 2, 1};
        int[] output3=fix23(array3);
        System.out.println(Arrays.toString(output3));
    }

    public static int[] fix23 (int[] nums) {
        for (int i = 0; i <nums.length; i++) {
            if ((nums.length>=2) && (nums[i]==2) && (nums[i+1]==3))
                nums[i+1]=0;
        }
      return nums;
    }
}
