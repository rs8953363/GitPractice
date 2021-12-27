/*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until
encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */
package Array2;

import java.util.Arrays;

public class tenRun {
    public static void main(String[] args) {
        int[] array1={2, 10, 3, 4, 20, 5};
        int[] output1=tenRun(array1);
        System.out.println(Arrays.toString(output1));

        int[] array2={2, 10, 3, 4, 20, 5};
        int[] output2=tenRun(array2);
        System.out.println(Arrays.toString(output2));

        int[] array3={2, 10, 3, 4, 20, 5};
        int[] output3=tenRun(array3);
        System.out.println(Arrays.toString(output3));

    }

    public static int[] tenRun(int[] nums) {
        int[] arr= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%10==0)
                nums[i+1]=nums[i];
            arr[i]=nums[i+1];
        }
        return arr;
    }
}
