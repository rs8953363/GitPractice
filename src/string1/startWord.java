/*Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of
the string, except its first char does not need to match exactly. On a match, return the front of the string, or
otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
The word will be at least length 1.
startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
 */
package string1;

public class startWord {
    public static void main(String[] args) {
        String output=startWord("hippo", "hi");
        System.out.println(output);
        String output1=startWord("hippo", "xip");
        System.out.println(output1);
        String output2=startWord("hippo", "i");
        System.out.println(output2);

    }

    public static String startWord(String str1, String str2) {
        if ((str1.length() >= str2.length()) && (str1.substring(1,str2.length()).equals(str2.substring(1))))
            return str1.substring(0,str2.length());
        else
            return "";

    }
}
