/*Given an int array length 2, return true if it contains a 2 or a 3.
has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
 */
package Array1;

public class has23 {
    public static void main(String[] args) {
        int[] array1={2, 5};
        boolean output1=has23(array1);
        System.out.println(output1);

        int[] array2={4,3};
        boolean output2=has23(array2);
        System.out.println(output2);

        int[] array3={4,5};
        boolean output3=has23(array3);
        System.out.println(output3);


    }

    public static boolean has23(int[] nums) {
        if ((nums[0]==2) || (nums[0]==3) ||(nums[1]==2) ||(nums[1]==3))
            return true;
        else
            return false;
    }
}
