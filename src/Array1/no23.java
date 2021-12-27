/*Given an int array length 2, return true if it does not contain a 2 or 3.
no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */
package Array1;

public class no23 {
    public static void main(String[] args) {
        int[] array1={4, 5};
        boolean output1=no23(array1);
        System.out.println(output1);

        int[] array2={4, 2};
        boolean output2=no23(array2);
        System.out.println(output2);

        int[] array3={3, 5};
        boolean output3=no23(array3);
        System.out.println(output3);
    }

    public static boolean no23(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            if ((nums[i]==2) || (nums[i]==3))
                return false;
        }
        return true;
    }
}
