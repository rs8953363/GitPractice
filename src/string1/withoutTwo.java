/*Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring
at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise,
return the original string unchanged.
without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
 */
package string1;

public class withoutTwo {
    public static void main(String[] args) {
        String output=without2("HelloHe");
        System.out.println(output);
        String output1=without2("HelloHi");
        System.out.println(output1);
        String output2=without2("Hi");
        System.out.println(output2);
        String output3=without2("Hix");
        System.out.println(output3);
    }

    public static String without2(String str) {
        if (str.length()>-2) {
            if (str.substring(0,2).equals(str.substring(str.length()-2)))
              return str.substring(2);
            else
                return str;
    }else
        return str;
}
}
