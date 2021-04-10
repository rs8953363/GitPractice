/*Given an array of ints length 3, return the sum of all the elements.
sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */
package Array1;

public class sum3 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int output=sum3(array1);
        System.out.println(output);

        int[] array2={5, 11, 2};
        int output2=sum3(array2);
        System.out.println(output2);

        int[] array3={7, 0, 0};
        int output3=sum3(array3);
        System.out.println(output3);
    }

    public static int sum3(int[] nums) {
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum=sum+nums[i];
        }
        return sum;
    }
}
