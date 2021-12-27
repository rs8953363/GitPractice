/*Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */
package Array2;

public class lucky13 {
    public static void main(String[] args) {
        int[] array1={0, 2, 4};
        boolean output1=lucky13(array1);
        System.out.println(output1);

        int[] array2={1, 2, 3};
        boolean output2=lucky13(array2);
        System.out.println(output2);

        int[] array3={1, 2, 4};
        boolean output3=lucky13(array3);
        System.out.println(output3);
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]!=1) && (nums[i]!=3))
                return true;
        }
       return false;
    }
}
