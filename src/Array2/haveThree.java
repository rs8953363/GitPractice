/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each
other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */
package Array2;

public class haveThree {
    public static void main(String[] args) {
        int[] array1={3, 1, 3, 1, 3};
        boolean output1 = haveThree(array1);
        System.out.println(output1);

        int[] array2={3, 1, 3, 3};
        boolean output2 = haveThree(array2);
        System.out.println(output2);

        int[] array3={3, 4, 3, 3, 4};
        boolean output3 = haveThree(array3);
        System.out.println(output3);
    }

    public static boolean haveThree(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]==3)
                count++;
            if (count==3){
                if(nums[i+1]==3){
                    if(nums[i+2]==3)
                        return false;
                    else
                        return true;
                }
            }
        }
        return false;
    }
}
