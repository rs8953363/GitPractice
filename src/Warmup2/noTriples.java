/*Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */
package Warmup2;

public class noTriples {
    public static void main(String[] args) {
        int array1[]={1, 1, 2, 2, 1};
        boolean output=noTriples(array1);
        System.out.println(output);
        int array2[]={1, 1, 2, 2, 2, 1};
        boolean output2=noTriples(array2);
        System.out.println(output2);
        int array3[]={1, 1, 1, 2, 2, 2, 1};
        boolean output3=noTriples(array3);
        System.out.println(output3);

    }
    public static boolean noTriples(int[] nums){
        for (int i=0; i<nums.length-2;i++){
            if((nums[i]==nums[i+1])&&(nums[i+1]==nums[i+2])) {
                return false;
            }
        }
        return true;
    }

}
