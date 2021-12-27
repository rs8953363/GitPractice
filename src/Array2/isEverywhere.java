/*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one
of the pair is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */
package Array2;

public class isEverywhere {
    public static void main(String[] args) {

    int[] array1={1, 2, 1, 3};
    boolean output1=isEverywhere(array1, 1);
    System.out.println(output1);

    int[] array2={1, 2, 1, 3};
    boolean output2=isEverywhere(array2, 2);
    System.out.println(output2);

    int[] array3={1, 2, 1, 3,4};
    boolean output3=isEverywhere(array3, 1);
    System.out.println(output3);
    }

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i]!=val) && (nums[i+1]!=val))
                return false;
        }
return true;
    }
}
