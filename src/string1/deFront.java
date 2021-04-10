/*Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the
second char if it is 'b'. The string may be any length. Harder than it looks.
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
package string1;

public class deFront {
    public static void main(String[] args) {
        String output=deFront("Hello");
        System.out.println(output);
        String output1=deFront("java");
        System.out.println(output1);
        String output2=deFront("away");
        System.out.println(output2);
    }
    public static String deFront(String str) {
        if ((str.substring(0,1).equals("a")) && (str.substring(1,2).equals("b")))
            return "ab"+str.substring(2);
        else if (str.substring(0,1).equals("a"))
            return "a"+str.substring(2);
        else if (str.substring(1,2).equals("b"))
            return "b"+str.substring(2);
        else
            return str.substring(2);
    }
}
