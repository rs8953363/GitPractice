/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array
contains an unlucky 1 in the first 2 or last 2 positions in the array.
unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */
package Array1;

public class unlucky1 {
    public static void main(String[] args) {
        int[] array1={1, 3, 4, 5};
        boolean output1=unlucky1(array1);
        System.out.println(output1);

        int[] array2={2, 1, 3, 4, 5};
        boolean output2=unlucky1(array2);
        System.out.println(output2);

        int[] array3={1, 1, 1};
        boolean output3=unlucky1(array3);
        System.out.println(output3);

        int[] array4={1, 4};
        boolean output4=unlucky1(array4);
        System.out.println(output4);
    }
    public static boolean unlucky1(int[] nums) {
        if (nums.length>2) {
            if (((nums[0] == 1) && (nums[1] == 3)) || ((nums[1] == 1) && (nums[2] == 3)) || ((nums[nums.length - 3] == 1) && (nums[nums.length - 2] == 3))
                    || ((nums[nums.length - 2] == 1) && (nums[nums.length - 1] == 3)))
                return true;
            else
                return false;
        }
        if (nums.length==2)
            if ((nums[0] == 1) && (nums[1] == 3))
                return true;

        return false;
    }
}
