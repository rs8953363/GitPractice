/*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
package Array1;

import java.util.Arrays;

public class middleWay {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int[] array2={4, 5, 6};
        int[] output1=middleWay(array1, array2);
        System.out.println(Arrays.toString(output1));

        int[] array3={7, 7, 7};
        int[] array4={3, 8, 0};
        int[] output2=middleWay(array3, array4);
        System.out.println(Arrays.toString(output2));

        int[] array5={5, 2, 9};
        int[] array6={1, 4, 5};
        int[] output3=middleWay(array5, array6);
        System.out.println(Arrays.toString(output3));
    }
    public static int[] middleWay(int[] nums1, int[] nums2) {
        return new int[] {nums1[nums1.length/2], nums2[nums2.length/2]};
    }
}
