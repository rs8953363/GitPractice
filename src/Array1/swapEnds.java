/*Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length
will be at least 1.
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */
package Array1;

import java.util.Arrays;

public class swapEnds {
    public static void main(String[] args) {
        int[] array1={1, 2, 3, 4};
        int[] output1=swapEnds(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={1, 2, 3};
        int[] output2=swapEnds(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={8, 6, 7, 9, 5};
        int[] output3=swapEnds(array3);
        System.out.println(Arrays.toString(output3));

    }

    public static int[] swapEnds(int[] nums) {
        int[] newArray=new int[nums.length];
         if (nums.length>=1)
             for (int i = 0; i <nums.length; i++) {
                 newArray[i]=nums[i];
                 newArray[0]=nums[nums.length-1];
                 newArray[nums.length-1]=nums[0];
             }
        return newArray;
    }
}
