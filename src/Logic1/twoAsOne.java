/*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false

 */
package Logic1;

public class twoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));

    }

    public static boolean twoAsOne(int a, int b, int c) {
        if ((a+b==c) || (b+c==a) || (a+c==b))
            return true;
        else
            return false;

    }
}
