/*Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
package Array1;
import java.util.Arrays;
public class rotateLeft3 {
    public static void main(String[] args) {

    int[] array1 = {1, 2, 3};
    int[] output1=rotateLeft3(array1);
    System.out.println(Arrays.toString(output1));

    int [] array2 = {5, 11, 9};
    int[] output2=rotateLeft3(array2);
    System.out.println(Arrays.toString(output2));

    int [] array3 = {7, 0, 0};
    int[] output3=rotateLeft3(array3);
    System.out.println(Arrays.toString(output3));
    //rotateLeft3 output = new rotateLeft3();
    //System.out.println(Arrays.toString(output.rotateLeft3(array2)));
    //System.out.println(Arrays.toString(output.rotateLeft3(array3)));
    }
    public static int[] rotateLeft3(int[] nums) {

        return new int[] {nums[1],nums[2],nums[0]};

    }
}
