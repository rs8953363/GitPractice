/*Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
package Array1;

import java.util.Arrays;

public class plusTwo {
    public static void main(String[] args) {
        int[] array1={1, 2};
        int[] array2={4, 4};
        int[] output1=plusTwo(array1, array2);
        System.out.println(Arrays.toString(output1));

        int[] array3={4, 4};
        int[] array4={2, 2};
        int[] output2=plusTwo(array3, array4);
        System.out.println(Arrays.toString(output2));

        int[] array5={9, 2};
        int[] array6={3, 4};
        int[] output3=plusTwo(array5, array6);
        System.out.println(Arrays.toString(output3));
    }
    public static int[] plusTwo(int[] nums1, int[] nums2) {
            return new int[]{nums1[0], nums1[1], nums2[0], nums2[1]};
        }
    }
