/*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java"
yields "ya". If either string is length 0, use '@' for its missing char.
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */
package string1;

public class lastChars {
    public static void main(String[] args) {
        String output=lastChars("last", "chars");
        System.out.println(output);
        String output1=lastChars("yo", "java");
        System.out.println(output1);
        String output2=lastChars("hi", "");
        System.out.println(output2);
    }

    public static String lastChars(String a, String b) {
        if (a.length()==0)
            return "@"+b.substring(0,1);
        else if (b.length()==0)
            return a.substring(0,1)+"@";
        else if ((a.length()==0) && (b.length()==0))
            return "@@";
        else
            return a.substring(0,1)+b.substring(b.length()-1);

    }
}
