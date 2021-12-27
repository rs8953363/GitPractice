/*Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are
 different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and
 "Hi" yield "loHi". The strings may be any length.
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */
package string1;

public class minCat {
    public static void main(String[] args) {
        String output=minCat("Hello", "Hi");
        System.out.println(output);
        String output1=minCat("Hello", "java");
        System.out.println(output1);
        String output2=minCat("java", "Hello");
        System.out.println(output2);
    }

    public static String minCat(String str1, String str2) {
        if (str1.length()>str2.length())
            return str1.substring(str1.length()-str2.length())+str2;
        else if (str2.length()>str1.length())
            return str1+str2.substring(str2.length()-str1.length());
        else
            return str1+str2;

    }
}
