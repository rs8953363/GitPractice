/*Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for
the missing chars.
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
 */
package string1;

public class atFirst {
    public static void main(String[] args) {
        String output=atFirst("hello");
        System.out.println(output);
        String output1=atFirst("hi");
        System.out.println(output1);
        String output2=atFirst("h");
        System.out.println(output2);

    }

    public static String atFirst(String str) {
        if ((str.length()>=2))
            return str.substring(0,2);
        else if ((str.length()==1))
            return str.substring(0,1)+"@";
        else
            return "@@";

    }
}
