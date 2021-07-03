/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false

 */
package Array2;

public class twoTwo {
    public static void main(String[] args) {
        int[] array1={4, 2, 2, 3};
        boolean output1=twoTwo(array1);
        System.out.println(output1);

        int[] array2={2, 2, 4};
        boolean output2=twoTwo(array2);
        System.out.println(output2);

        int[] array3={2, 2, 4, 2};
        boolean output3=twoTwo(array3);
        System.out.println(output3);
    }
    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i]==2) && (nums[i+1]==2))
                return true;
        }
        return false;
    }
}
