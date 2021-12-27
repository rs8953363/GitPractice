/*Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
-- see Introduction to Mod
old35(3) → true
old35(10) → true
old35(15) → false
 */
package Logic1;

import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;

import javax.swing.*;

public class old35 {
    public static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));
    }

    public static boolean old35(int num) {
        if (((num%3==0) || (num%5==0)) && (num%15!=0))
            return true;
    return false;
    }
}
