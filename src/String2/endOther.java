/*Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase()
returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */
package String2;

public class endOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));

    }

    public static boolean endOther(String str1, String str2) {
        if ((str1.toLowerCase().contains(str1.toLowerCase())) || (str2.toLowerCase().contains(str1.toLowerCase())))
            return true;
        else
            return false;
    }
}
