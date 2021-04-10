/*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */
package Array1;

public class commonEnd {
    public static void main(String[] args) {

        int [] array1={1, 2, 3};
        int [] array2= {7, 3};
        boolean output=commonEnd(array1, array2);
        System.out.println(output);

        int [] array3={1, 2, 3};
        int [] array4= {7, 3, 2};
        boolean output1=commonEnd(array3, array4);
        System.out.println(output1);

        int [] array5={1, 2, 3};
        int [] array6= {1, 3};
        boolean output2=commonEnd(array5, array6);
        System.out.println(output2);
    }
    public static boolean commonEnd(int[] a, int[] b) {
        if ((a[0]==b[0]) || (a[a.length-1]==b[b.length-1]))
            return true;
        else
            return false;

    }
}
