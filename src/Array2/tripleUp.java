/*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or
23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
 */
package Array2;

public class tripleUp {
    public static void main(String[] args) {
        int[] array1={1, 4, 5, 6, 2};
        boolean output1=tripleUp(array1);
        System.out.println(output1);

        int[] array2={1, 2, 3};
        boolean output2=tripleUp(array2);
        System.out.println(output2);

        int[] array3={1, 2, 4};
        boolean output3=tripleUp(array3);
        System.out.println(output3);
    }

    public static boolean tripleUp (int[] nums) {
        for (int i = 0; i <nums.length-2; i++) {
            if ((nums[i+1] == nums[i]+1) && (nums[i+2]==nums[i+1] + 1))
                return true;
        }
        return false;
    }
}
