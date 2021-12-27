/* Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */
package Array2;

public class has12 {
    public static void main(String[] args) {
        int[] array1={1, 3, 2};
        boolean output1 = has12 (array1);
        System.out.println(output1);

        int[] array2={3, 1, 2};
        boolean output2 = has12 (array2);
        System.out.println(output2);

        int[] array3={3, 1, 4, 5, 2};
        boolean output3 = has12 (array3);
        System.out.println(output3);

    }

    public static boolean has12(int[] nums) {
        boolean found1 = false;
        boolean found2 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                found1=true;
            if (nums[i] == 2)
                found2=true;
        }
        if (found1 && found2)
            return true;
        else
            return false;
    }
}
