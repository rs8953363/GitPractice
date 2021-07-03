/*Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated
by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 */
package Array2;

public class has77 {
    public static void main(String[] args) {
        int[] array1={1,7, 7};
        boolean output1=has77(array1);
        System.out.println(output1);

        int[] array2={1,7, 7};
        boolean output2=has77(array2);
        System.out.println(output2);

        int[] array3={1,7, 7};
        boolean output3=has77(array3);
        System.out.println(output3);
    }

    public static boolean has77(int[] nums) {
        for (int i=0; i<nums.length-1; i++){
            if ((nums[i]==7 && nums[i+1]==7)){
                return true;
            }
        }
        for (int i=0; i<nums.length-2; i++){
            if ((nums[i]==7 && nums[i+2]==7)){
                return true;
            }
        }
        return false;
    }
}
