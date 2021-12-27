/*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */
package Array2;

public class sum13 {
    public static void main(String[] args) {
        int[] array1={1, 2, 2, 1};
        int output1=sum13(array1);
        System.out.println(output1);

        int[] array2={1, 1};
        int output2=sum13(array2);
        System.out.println(output2);

        int[] array3={1, 2, 2, 1, 13};
        int output3=sum13(array3);
        System.out.println(output3);
    }

    public static int sum13(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=13)
                sum=sum+nums[i];
            if (i>0 && nums[i-1]==13)
                sum=sum-nums[i-1];
        }
return sum;
    }
}

