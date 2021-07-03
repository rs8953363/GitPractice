/*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */
package Array2;

public class modThree {
    public static void main(String[] args) {
        int[] array1={2, 1, 3, 5};
        boolean output1 = modThree(array1);
        System.out.println(output1);

        int[] array2={2, 1, 3, 5};
        boolean output2 = modThree(array2);
        System.out.println(output2);

        int[] array3={2, 1, 3, 5};
        boolean output3 = modThree(array3);
        System.out.println(output3);
    }

    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i]%2!=0) && (nums[i+1]%2!=0) && (nums[i+2]%2!=0))
                return true;
            if ((nums[i]%2==0) && (nums[i+1]%2==0) && (nums[i+2]%2==0))
                return true;
        }
        return false;
    }
}
