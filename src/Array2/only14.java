/*Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */
package Array2;

public class only14 {
    public static void main(String[] args) {
        int[] array1={1, 4, 1, 4};
        boolean output1=only14(array1);
        System.out.println(output1);

        int[] array2={1, 4, 2, 4};
        boolean output2=only14(array2);
        System.out.println(output2);

        int[] array3={1, 1};
        boolean output3=only14(array3);
        System.out.println(output3);
    }

    public static boolean only14 (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]!=1) && (nums[i]!=4))
                return false;
        }
        return true;
    }
}
