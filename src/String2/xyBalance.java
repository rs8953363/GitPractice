/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere
later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given
string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
package String2;

public class xyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }
    public static boolean xyBalance(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals("x")){
                if (str.substring(i+1).contains("y"))
                    return true;
                else
                    return false;
            }
        }
        return true;

    }
}
