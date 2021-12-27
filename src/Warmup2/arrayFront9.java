/*Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less
than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */
package Warmup2;

public class arrayFront9 {
    public static void main(String[] args) {
        int array[] = {1, 2, 9, 3, 4};
        boolean output = arrayFront9(array);
        System.out.println(output);
        int array2[] = {1, 2, 3, 4, 9};
        boolean output2 = arrayFront9(array2);
        System.out.println(output2);
        int array3[] = {1, 2, 3, 4, 5};
        boolean output3 = arrayFront9(array3);
        System.out.println(output3);
    }

    public static boolean arrayFront9(int[] nums) {
        if (nums.length >= 4) {
            for (int i = 0; i < 4; i++) {
                if ((nums[i]) == 9)
                    return true;
            }
            return false;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 9)
                    return true;
            }
            return false;
        }
    }
}
