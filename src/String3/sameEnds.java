/*Given a string, return the longest substring that appears at both the beginning and end of the string without
overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */
package String3;

public class sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
    }

    public static String sameEnds(String str) {
        String result="";
        for (int i = 0; i <= str.length()/2; i++) {
            for (int j = str.length()/2; j <str.length() ; j++) {
                if (str.substring(0,i).equals(str.substring(j)))
                    result=str.substring(0,i);
            }
        }
return result;
    }
}
