/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are
equal.
sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
 */
package Array1;

public class sameFirstLast {
    public static void main(String[] args) {
        int array1[]={1, 2, 3};
        boolean output=sameFirstLast(array1);
        System.out.println(output);
        int array2[]={1, 2, 3, 1};
        boolean output2=sameFirstLast(array2);
        System.out.println(output2);
        int array3[]={1, 2, 1};
        boolean output3=sameFirstLast(array3);
        System.out.println(output3);
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length>=1) {
            if (nums[0] == nums[nums.length - 1])
                return true;
            else
                return false;
        }else
            return false;
    }
}
