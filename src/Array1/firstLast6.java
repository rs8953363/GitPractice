/*Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be
length 1 or more.
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */
package Array1;

public class firstLast6 {
    public static void main(String[] args) {
        int array1[]={1, 2, 6};
        boolean output1=firstLast6(array1);
        System.out.println(output1);
        int array2[]={6, 1, 2, 3};
        boolean output2=firstLast6(array2);
        System.out.println(output2);
        int array3[]={13, 6, 1, 2, 3};
        boolean output3=firstLast6(array3);
        System.out.println(output3);

    }

    public static boolean firstLast6(int [] nums) {
        if ((nums[0]==6) || (nums[nums.length-1]==6))
                return true;
        else
            return false;
    }
}
