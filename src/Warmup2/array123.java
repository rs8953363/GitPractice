/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
package Warmup2;

public class array123 {
    public static void main(String[] args) {
        int array1[]={1, 1, 2, 3, 1};
        boolean output=array123(array1);
        System.out.println(output);
        int array2[]={1, 1, 2, 4, 1};
        boolean output2=array123(array2);
        System.out.println(output2);
        int array3[]={1, 1, 2, 1, 2, 3};
        boolean output3=array123(array3);
        System.out.println(output3);
    }
    public static boolean array123(int[] nums){
        for(int i=0; i<nums.length-2;i++){
            if ((nums[i]==1)&&(nums[i+1]==2)&&(nums[i+2]==3))
                return true;
        }
        return false;
    }
}
