/*Given two strings, append them together (known as "concatenation") and return the result. However, if the
concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
public class conCat {
    public static void main(String[] args) {
        String output=conCat("abc", "cat");
        System.out.println(output);
        String output1=conCat("dog", "cat");
        System.out.println(output1);
        String output2=conCat("abc", "");
        System.out.println(output2);
        String output3=conCat("abcxy", "yz");
        System.out.println(output3);
    }
    public static String conCat(String a, String b) {
        if (a.length()!=0 && b.length()!=0 && (a.substring(a.length()-1)==b.substring(0,1)))
            return a+b.substring(1);
        else
            return a+b;
    }
}
