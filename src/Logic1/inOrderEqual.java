/*Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not
6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true

 */
package Logic1;

import com.sun.security.jgss.GSSUtil;

public class inOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(2, 5, 11, false));
        System.out.println(inOrderEqual(5, 7, 6, false));
        System.out.println(inOrderEqual(5, 5, 7, true));

    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if ((equalOk) && (b>=a) && (c>=b))
            return true;
        if ((b>a) && (c>b))
            return true;
        else
            return false;

    }
}
