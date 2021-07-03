/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring
the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy,
and likewise for the largest value. Use int division to produce the final average. You may assume that the array is
length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
package Array2;

import java.util.Arrays;

public class centeredAverage<result> {
    public static void main(String[] args) {

        int[] array1={1, 2, 3, 4, 100};
        int output1=centeredAverage(array1);
        System.out.println(output1);

        int[] array2={1, 1, 5, 5, 10, 8, 7};
        int output2=centeredAverage(array2);
        System.out.println(output2);

        int[] array3={-10, -4, -2, -4, -2, 0};
        int output3=centeredAverage(array3);
        System.out.println(output3);

    }

    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int result=nums[nums.length/2];
        if (nums.length %2==0){
            result=(nums[(nums.length/2-1)]+nums[(nums.length/2)])/2;
        }
        return result;
}
}
