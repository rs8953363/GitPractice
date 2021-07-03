/*Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
package Array2;

public class more14 {
    public static void main(String[] args) {
        int[] array1={1, 4, 1};
        boolean output1=more14(array1);
        System.out.println(output1);

        int[] array2={1, 4, 1, 4};
        boolean output2=more14(array2);
        System.out.println(output2);

        int[] array3={1, 1};
        boolean output3=more14(array3);
        System.out.println(output3);
    }

    public static boolean more14 (int[] nums) {
        int count1=0;
        int count4=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1)
                    count1++;
            if (nums[i]==4)
                    count4++;
        }
    if (count1>count4)
                return true;
    else return false;
    }
}
