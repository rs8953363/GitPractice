/*Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
The string length will be at least 2.
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
package string1;

public class middleTwo {
    public static void main(String[] args) {
        String output=middleTwo("string");
        System.out.println(output);
        String output1=middleTwo("code");
        System.out.println(output1);
        String output2=middleTwo("Practice");
        System.out.println(output2);
    }
    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }
}
