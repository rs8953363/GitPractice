/*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and
the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */
package string1;

public class comboString {
    public static void main(String[] args) {
        String output=comboString("Hello", "hi");
        System.out.println(output);
        String output1=comboString("hi", "Hello");
        System.out.println(output1);
        String output2=comboString("aaa", "b");
        System.out.println(output2);
    }
    public static String comboString (String a, String b) {
        if ((a.length())>(b.length()))
            return b+a+b;
        else
            return a+b+a;
    }
}
