/*Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the
other elements to be that value. Return the changed array.
maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
package Array1;

import java.util.Arrays;

public class maxEnd3 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int[] output1=maxEnd3(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={11, 5, 9};
        int[] output2=maxEnd3(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={2, 11, 3};
        int[] output3=maxEnd3(array3);
        System.out.println(Arrays.toString(output3));
    }
    public static int[] maxEnd3(int[] nums){
        int max=nums[0];
        if ((nums[2])>max)
            max=nums[2];
        return new int[]{max, max, max};
    }
}
