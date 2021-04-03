/*Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
package Warmup2;

public class stringX {
    public static void main(String[] args) {
        String output=stringX("xxHxix");
        System.out.println(output);
        String output1=stringX("abxxxcd");
        System.out.println(output1);
        String output2=stringX("xabxxxcdx");
        System.out.println(output2);
        String output3=stringX("xx");
        System.out.println(output3);
    }
    public static String stringX(String str) {
        if (str.length()>2)
        for (int i = 0; i < str.length(); i++) {
            if ((str.substring(i + 1, i + 2).equals("x")))
                return str.substring(0, 1) + str.substring(i, str.length() - 1).replaceAll("x", "") +
                        str.substring(str.length() - 1);
        }
        return str;
    }
}
