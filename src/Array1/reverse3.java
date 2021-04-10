/*Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */
package Array1;

import java.util.Arrays;

public class reverse3 {
    public static void main(String[] args) {
        int[] array1={1,2,3};
        int[] array2={5,11,9};
        int[] array3={7,0,0};
        System.out.println(Arrays.toString(reverse3(array1)));
        System.out.println(Arrays.toString(reverse3(array2)));
        System.out.println(Arrays.toString(reverse3(array3)));
    }

    public static int[] reverse3(int[] nums) {
        return new int[] {nums[2],nums[1], nums[0]};

    }
}
