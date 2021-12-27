/*Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the
length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new
int array is: new int[desired_length]   (See also: FizzBuzz Code)

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
package Array2;

import java.util.ArrayList;

public class fizzArray {
    public static void main(String[] args) {

        int[] array1=fizzArray(4);
        System.out.println(array1.toString());

        int[] array2=fizzArray(1);
        System.out.println(array2.toString());

        int[] array3=fizzArray(10);
        System.out.println(array3.toString());
    }
    public static int[] fizzArray(int num) {
        int[] array=new int[num];
        for (int i = 0; i < num; i++) {
           array[i]=i;
        }
        return array;

        /
         */
    }
}
