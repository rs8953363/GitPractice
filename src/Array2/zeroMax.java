/*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the
right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
 */
package Array2;

public class zeroMax {
    public static void main(String[] args) {
        int[] array1={0, 5, 0, 3};
        int[] output1=zeroMax(array1);
        System.out.println(output1);

        int[] array2={0, 4, 0, 3};
        int[] output2=zeroMax(array2);
        System.out.println(output2);

        int[] array3={0, 1, 0};
        int[] output3=zeroMax(array3);
        System.out.println(output3);

    }

    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                for (int j = i; j <nums.length ; j++) {
                    if (nums[j]%2!=0)
                        nums[i]=nums[j];
                }
            }
        }
return nums;
    }
}
