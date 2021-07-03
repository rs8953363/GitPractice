/*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */
package Array2;
import java.util.Arrays;

public class countEvens {
    public static void main(String[] args) {

        int[] array1={2, 1, 2, 3, 4};
        int output1=countEvens(array1);
        System.out.println(output1);

        int[] array2={2, 2, 0};
        int output2=countEvens(array2);
        System.out.println(output2);

        int[] arrays3={1, 3, 5};
        int output3=countEvens(arrays3);
        System.out.println(output3);

    }

    public static int countEvens(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}

