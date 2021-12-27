/*Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count
instances where the second "6" is actually a 7.
array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
 */
package Warmup2;

public class array667 {
    public static void main(String[] args) {
        int array1[]={6, 6, 2};
        int output=array667(array1);
        System.out.println(output);
        int array2[]={6, 6, 2, 6};
        int output2=array667(array2);
        System.out.println(output2);
        int array3[]={6, 7, 2, 6};
        int output3=array667(array3);
        System.out.println(output3);
        int array4[]={6, 6, 2, 6, 7};
        int output4=array667(array4);
        System.out.println(output4);
    }
    public static int array667(int[] nums){
        int count=0;
        for(int i=0; i<nums.length-1;i++){
            if ((nums[i]==6) && ((nums[i+1]==6) || (nums[i+1]==7)))
                count++;
        }
        return count;
    }
}
