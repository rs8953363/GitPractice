/*Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which
has the largest sum. In event of a tie, return a.
biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
package Array1;

import java.util.Arrays;

public class biggerTwo {
    public static void main(String[] args) {
        int[] array1={1, 2};
        int[] array2={3, 4};
        int[] output1=biggerTwo(array1, array2);
        System.out.println(Arrays.toString(output1));

        int[] array3={3, 4};
        int[] array4={1, 2};
        int[] output2=biggerTwo(array3, array4);
        System.out.println(Arrays.toString(output2));

        int[] array5={1, 1};
        int[] array6={1, 2};
        int[] output3=biggerTwo(array5, array6);
        System.out.println(Arrays.toString(output3));

    }
    public static int[] biggerTwo (int[] nums1, int[] nums2) {
        if ((nums1[0]+nums1[1]) >= (nums2[0]+nums2[1]))
            return nums1;
        else
            return nums2;
    }


}
