/*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period
(.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */
package String2;

import javax.swing.*;

public class xyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    public static boolean xyzThere(String str) {
        if (str.length() >= 3) {
            for (int i = 0; i < str.length() - 3; i++) {
                if ((str.substring(i + 1, i + 4).equals("xyz")) && (str.substring(i).equals(".")))
                    return false;
            }
            return true;
        } else
            return false;
    }
}