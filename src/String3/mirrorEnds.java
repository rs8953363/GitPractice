/*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of the string in
reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */
package String3;

public class mirrorEnds{
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String str) {
        int p = str.length()-1;
        for (int i = 0; i < str.length(); i++, p--) {
                if (str.charAt(i) != str.charAt(p))
                    return str.substring(0,i);
            }
        return str;
    }
    }
