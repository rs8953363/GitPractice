/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the even
numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the
given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
 */
package Array2;

public class evenOdd {
    public static void main(String[] args) {
        int[] array1={1, 0, 1, 0, 0, 1, 1};
        int[] output1=evenOdd(array1);
        System.out.println(output1);

        int[] array2={3, 3, 2};
        int[] output2=evenOdd(array2);
        System.out.println(output2);

        int[] array3={2, 2, 2};
        int[] output3=evenOdd(array3);
        System.out.println(output3);
    }

    public static int[] evenOdd(int[] nums) {
        int[] arr=new int[nums.length];
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0)
                arr[i]=nums[i];
            nums[i]=nums[count];
            count++;
        }
        return arr;
    }
}
