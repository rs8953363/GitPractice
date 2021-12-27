/*Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least
length 1.
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */
package string1;

public class nonStart {
    public static void main(String[] args) {
        String output=nonStart("Hello", "There");
        System.out.println(output);
        String output1=nonStart("java", "code");
        System.out.println(output1);
        String output2=nonStart("shotl", "java");
        System.out.println(output2);

    }

    public static String nonStart(String str1, String str2) {
        return str1.substring(1,str1.length())+str2.substring(1,str2.length());

    }
}
