/*Return true if the group of N numbers at the start and end of the array are the same. For example, with
{5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in
the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false

 */
package Array2;

public class sameEnds {
    public static void main(String[] args) {
        int[] array1={5, 6, 45, 99, 13, 5, 6};
        boolean output1=sameEnds(array1, 1);
        System.out.println(output1);

        int[] array2={5, 6, 45, 99, 13, 5, 6};
        boolean output2=sameEnds(array2, 2);
        System.out.println(output2);

        int[] array3={5, 6, 45, 99, 13, 5, 6};
        boolean output3=sameEnds(array3, 3);
        System.out.println(output3);

    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
           if ((nums[i] == nums[nums.length-len+i]))
               return true;
        }
        return false;
    }
}
