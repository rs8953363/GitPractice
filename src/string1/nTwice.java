/*Given a string and an int n, return a string made of the first and last n chars from the string. The string length
will be at least n.
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
 */
package string1;

public class nTwice {
    public static void main(String[] args) {
        String output=nTwice("Hello", 2);
        System.out.println(output);
        String output1=nTwice("Chocolate", 3);
        System.out.println(output1);
        String output2=nTwice("Chocolate", 1);
        System.out.println(output2);
    }
    public static String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }
}
