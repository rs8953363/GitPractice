/*Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
just sum up the elements that exist, returning 0 if the array is length 0.
sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
 */
package Array1;

public class sum2 {
    public static void main(String[] args) {
        int[] array={1, 2, 3};
        int output=sum2(array);
        System.out.println(output);

        int[] array1={1, 1};
        int output1=sum2(array1);
        System.out.println(output1);

        int[] array2={1, 1, 1, 1};
        int output2=sum2(array2);
        System.out.println(output2);
    }
    public static int sum2(int[] nums) {
        int sum=0;
        if (nums.length>=2)
            sum=nums[0]+nums[1];
        else if (nums.length==1)
            sum=nums[0];
        return sum;


    }
}
