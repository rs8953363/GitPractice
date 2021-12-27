/*Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is
shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
Note that str.length() returns the length of a string.
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
 */
package string1;

public class firstTwo {
    public static void main(String[] args) {
        String output=firstTwo("Hello");
        System.out.println(output);
        String output1=firstTwo("abcdefg");
        System.out.println(output1);
        String output2=firstTwo("ab");
        System.out.println(output2);
        String output3=firstTwo("");
        System.out.println(output3);
        String output4=firstTwo("x");
        System.out.println(output4);
    }
    public static String firstTwo(String str){
        if ((str.length()>=2))
            return str.substring(0,2);
        else
            return str;
    }
}
