/*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */
package Array1;

public class start1 {
    public static void main(String[] args) {
        int[] array1={1, 2, 3};
        int[] array2={1, 3};
        int output1=start1(array1, array2);
        System.out.println(output1);

        int[] array3={7, 2, 3};
        int[] array4={1};
        int output2=start1(array3, array4);
        System.out.println(output2);

        int[] array5={1, 2};
        int[] array6={};
        int output3=start1(array5, array6);
        System.out.println(output3);

    }

    public static int start1(int[] nums1, int[]nums2) {
        if ((nums1.length!=0) && (nums2.length!=0)) {
            if ((nums1[0] == 1) && (nums2[0] == 1))
                return 2;
            else if ((nums1[0] == 1) || (nums2[0] == 1))
                return 1;
            else
                return 0;
        }
        if ((nums1.length!=0) && (nums2.length==0)) {
            if (nums1[0] == 1)
                return 1;
            else
                return 0;
        }
        if ((nums1.length==0) && (nums2.length!=0)) {
            if (nums2[0] == 1)
                return 1;
            else
                return 0;
        }
        if ((nums1.length==0) && (nums2.length==0)) {

        }
        return 0;
    }
}
