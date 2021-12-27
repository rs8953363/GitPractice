/*Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
package String2;

public class doubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

    }

    public static String doubleChar(String str) {
        String result="";
        for (int i = 0; i <str.length(); i++) {
            result= result + str.substring(i,i+1)+str.substring(i,i+1);
        }
    return result;
    }
}
