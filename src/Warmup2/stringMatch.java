/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
package Warmup2;

public class stringMatch{
    public static void main(String[] args) {
        int output=stringMatch("xxcaazz", "xxbaaz");
        System.out.println(output);
        int output1=stringMatch("abc", "abc");
        System.out.println(output1);
        int output2=stringMatch("abc", "axc");
        System.out.println(output2);

    }
    public static int stringMatch(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < Math.min(str1.length(),str2.length())-1; i++) {
            if ((str1.substring(i, i + 2)).equals(str2.substring(i, i + 2)))
                count++;
        }
        return count;
    }
}
