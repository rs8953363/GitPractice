/*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */
package Array2;

public class sum28 {
    public static void main(String[] args) {
    int[] array1={2, 3, 2, 2, 4, 2};
    boolean output1=sum28(array1);
    System.out.println(output1);

    int[] array2={2, 3, 2, 2, 4, 2, 2};
    boolean output2=sum28(array2);
    System.out.println(output2);

    int[] array3={1, 2, 3, 4};
    boolean output3=sum28(array3);
    System.out.println(output3);
    }

    public static boolean sum28(int[] nums) {
    int sum=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]==2)
                sum=sum+nums[i];
        }
        if (sum==8)
            return true;
        else
            return false;
    }
}
