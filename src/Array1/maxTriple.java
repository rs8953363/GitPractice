/*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.
maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
package Array1;

import java.util.Arrays;

public class maxTriple {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int output1=maxTriple(array1);
        System.out.println(output1);

        int[] array2={1, 5, 3};
        int output2=maxTriple(array2);
        System.out.println(output2);

        int[] array3={5, 2, 3};
        int output3=maxTriple(array3);
        System.out.println(output3);

        int[] array4={1};
        int output4=maxTriple(array4);
        System.out.println(output4);

        int[] array5={3,79,3,10,36};
        int output5=maxTriple(array5);
        System.out.println(output5);
    }
    public static int maxTriple(int[] nums) {
        int max=nums[0];
        if ((nums[nums.length/2])>nums[0] && (nums[nums.length/2])>nums[nums.length-1])
            max=nums[nums.length/2];
        else if (nums[nums.length-1]>nums[0] && (nums[nums.length-1])>nums[nums.length/2])
            max=nums[nums.length-1];
        else
            max=nums[0];
        return max;
    }
}
