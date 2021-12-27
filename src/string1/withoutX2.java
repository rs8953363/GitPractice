/*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
return the string unchanged. This is a little harder than it looks.
withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */
package string1;

public class withoutX2 {
    public static void main(String[] args) {
        String output=withoutX2("xHi");
        System.out.println(output);
        String output1=withoutX2("Hxi");
        System.out.println(output1);
        String output2=withoutX2("Hi");
        System.out.println(output2);
    }

    public static String withoutX2(String str) {
        if (str.length() > 1) {
            if ((str.substring(0, 1).equals("x")) && (str.substring(1, 2).equals("x")))
                return str.substring(2);
            else if ((str.substring(0, 1).equals("x")))
                return str.substring(1);
            else if (str.substring(1, 2).equals("x"))
                return str.substring(0, 1) + str.substring(2);
            else
                return str;

        } else if (str.equals("x"))
            return "";
        else
            return str;
    }
}
