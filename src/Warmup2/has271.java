/*Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */
package Warmup2;

public class has271 {
    public static void main(String[] args) {
        int array1[]={1,2,7,1};
        boolean output=has271(array1);
        System.out.println(output);
        int array2[]={1, 2, 8, 1};
        boolean output1=has271(array2);
        System.out.println(output1);
        int array3[]={2, 7, 1};
        boolean output3=has271(array3);
        System.out.println(output3);

    }
    public static boolean has271(int[] nums){
        for (int i=0; i<nums.length-2; i++){
                if ((nums[i+1] == (nums[i]+5)) && (nums[i+2]== nums[i] -1) && (nums[i+2]== nums[i] -2))
                    return true;
            }
        return false;
    }
}
