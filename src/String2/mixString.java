/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char
of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
package String2;

public class mixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));

    }

    public static String mixString(String str1, String str2) {
    String result="";
    int max=Math.max(str1.length(),str2.length());
        for (int i = 0; i<max; i++) {
            if (i<str1.length())
                result=result+ str1.substring(i,i+1);
            if (i<str2.length())
                result=result+str2.substring(i,i+1);
        }
        return result;
    }
}
