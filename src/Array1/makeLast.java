/*Given an int array, return a new array with double the length where its last element is the same as the original 
array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array 
contains all 0's.
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */
package Array1;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {
        int[] array1={4, 5, 6};
        int[] array2={1,2};
        int[] array3 = {3};
        int[] output1=makeLast(array1);
        int[] output2=makeLast(array2);
        int[] output3=makeLast(array3);
        System.out.println(Arrays.toString(output1));
        System.out.println(Arrays.toString(output2));
        System.out.println(Arrays.toString(output3));
    }
    public static int[] makeLast(int[] nums) {

        int[] doubleArray=new int[2*nums.length];
        for (int i = 0; i <nums.length-1; i++) {
            doubleArray[i]=0;
            }
            doubleArray[doubleArray.length-1]=nums[nums.length-1];
            return doubleArray;
    }
}
