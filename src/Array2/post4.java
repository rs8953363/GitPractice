/*Given a non-empty array of ints, return a new array containing the elements from the original array that come after
the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to
create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */
package Array2;

public class post4 {
    public static void main(String[] args) {
        int[] array1={2, 4, 1, 2};
        int[] output1=post4(array1);
        System.out.println(output1);

        int[] array2={2, 4, 1, 2};
        int[] output2=post4(array2);
        System.out.println(output2);

        int[] array3={2, 4, 1, 2};
        int[] output3=post4(array3);
        System.out.println(output3);

    }

    public static int[] post4 (int[] nums) {
        int i=0;
        while (nums[i]!=4)
            i++;
        int[] arr=new int[nums.length-1-i];
        for (int j = i+1; j < nums.length; j++) {
            arr[j]=nums[j];
        }
        return arr;
    }
}
