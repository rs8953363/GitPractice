/*Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array
is length 0, ignore that array.
front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */
package Array1;

import java.util.Arrays;

public class front11 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int[] array2={7, 9, 8};
        int[] output1=front11(array1, array2);
        System.out.println(Arrays.toString(output1));

        int[] array3={1};
        int[] array4={2};
        int[] output2=front11(array3, array4);
        System.out.println(Arrays.toString(output2));

        int[] array5={1, 7};
        int[] array6={};
        int[] output3=front11(array5, array6);
        System.out.println(Arrays.toString(output3));
    }
    public static int[] front11(int[] nums1, int[] nums2) {
        if (nums1.length>=1) {
            if (nums2.length >= 1)
                return new int[]{nums1[0], nums2[0]};
            else
                return new int[]{nums1[0]};
        }
        if (nums2.length>=1)
            return new int[]{nums2[0]};
        else
            return new int[]{};
}
}

