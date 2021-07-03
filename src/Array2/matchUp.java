/*Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in
nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are
not equal.

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
 */
package Array2;

public class matchUp {
    public static void main(String[] args) {

    int[] array1={1, 2, 3};
    int[] array2={2, 3, 10};
    int output1=matchUp(array1, array2);
    System.out.println(output1);

    int[] array3={1, 2, 3};
    int[] array4={2, 3, 3};
    int output2=matchUp(array3, array4);
    System.out.println(output2);

    int[] array5={1, 2, 3};
    int[] array6={2, 3, 10};
    int output3=matchUp(array5, array6);
    System.out.println(output3);
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count=0;
        for (int i = 0; i < nums1.length; i++) {
            if ((Math.abs(nums1[i]-nums2[i])==1) || (Math.abs(nums1[i]-nums2[i])==2))
                count++;
        }
        return count;
    }
}
