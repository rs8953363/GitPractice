/*Given start and end numbers, return a new array containing the sequence of integers from start up to but not including
end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note
that a length-0 array is valid. (See also: FizzBuzz Code)

fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
 */
package Array2;

import java.util.Arrays;

public class fizzArray3 {
    public static void main(String[] args) {
        int[] output1= fizzArray3(5, 10);
        System.out.println(Arrays.toString(output1));

        int[] output2= fizzArray3(11, 18);
        System.out.println(output2);

        int[] output3= fizzArray3(1, 3);
        System.out.println(output3);

    }

    public static int[] fizzArray3(int start, int end) {
        int n = end - start;
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = start++;
        return result;
    }
}
