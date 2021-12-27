/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return
 the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */
package Array2;

public class shiftLeft {
    public static void main(String[] args) {
        int[] array1 = {6, 2, 5, 3};
        int[] output1 = shiftLeft(array1);
        System.out.println(output1);

        int[] array2 = {6, 2, 5, 3};
        int[] output2 = shiftLeft(array2);
        System.out.println(output2);

        int[] array3 = {6, 2, 5, 3};
        int[] output3 = shiftLeft(array3);
        System.out.println(output3);
    }

    public static int[] shiftLeft(int[] nums) {
        int[] arr = new int[nums.length];
        if (nums.length == 0)
            return arr;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0)
                arr[i] = nums[i + 1];
        }
        if (nums.length > 1)
            arr[0] = nums[1];
        arr[nums.length - 1] = nums[0];
        return arr;
    }
}