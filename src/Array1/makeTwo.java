/*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed
by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available
between the 2 arrays.
make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
package Array1;

import java.util.Arrays;

public class makeTwo {
    public static void main(String[] args) {
        int[] array1={4, 5};
        int[] array2={1, 2, 3};
        int[] output1=makeTwo(array1,array2);
        System.out.println(Arrays.toString(output1));

        int[] array3={4};
        int[] array4={1, 2, 3};
        int[] output2=makeTwo(array3,array4);
        System.out.println(Arrays.toString(output2));

        int[] array5={};
        int[] array6={1, 2};
        int[] output3=makeTwo(array5,array6);
        System.out.println(Arrays.toString(output3));
    }

    public static int[] makeTwo(int[] nums1, int[] nums2) {
        if (nums1.length>=2)
           return nums1;
        else if (nums1.length==1)
           return new  int[]{nums1[0], nums2[0]};
        else
            return nums2;
    }
}
