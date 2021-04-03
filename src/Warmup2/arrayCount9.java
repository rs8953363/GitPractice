/*Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
package Warmup2;

public class arrayCount9 {
    public static void main(String[] args) {
        int array1[] ={1,2,9};
        int output=arrayCount9(array1);
        System.out.println(output);
        int array2[]={1,9,9};
        int output2=arrayCount9(array2);
        System.out.println(output2);
        int array3[]={1,9,9,3,9};
        int output3=arrayCount9(array3);
        System.out.println(output3);

    }
    public static int arrayCount9(int [] num){
        int count=0;
        for(int i=0; i<num.length; i++){
            if (num[i]==9)
                    count++;
        }
        return count;
    }
}
