/*Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding"
yields "codign".
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */
package string1;

import java.util.Locale;

public class lastTwo {
    public static void main(String[] args) {
        String output=lastTwo("coding");
        System.out.println(output);
        String output1=lastTwo("cat");
        System.out.println(output1);
        String output2=lastTwo("ab");
        System.out.println(output2);
    }
    public static String lastTwo(String str) {
        if (str.length() <= 1)
            return str;
        else
            return str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
    }
}

