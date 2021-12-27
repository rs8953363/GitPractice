/*Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
So if either value is a teen, just return 19.
teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */
package Logic1;

public class teenSum {
    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));
        System.out.println(teenSum(10, 13));
        System.out.println(teenSum(13, 2));
    }

    public static int teenSum(int num1, int num2) {
        if (((num1>=13) && (num1<=19)) || ((num2>=13) && (num2<=19)))
            return 19;
        else
            return  num1+num2;

    }
}
