/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a
string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */
package String2;

public class zipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str) {
        String result="";

        if (str.length()<2)
            return str;
        for (int i = 0; i <str.length()-2 ; i++) {
            if (str.substring(i,i+1).equals("z") && str.substring(i+2,i+3).equals("p")) {
                result = result + str.substring(i, i + 1) + str.substring(i + 2, i + 3);
                i = i + 2;
            }else
                result=result+str.substring(i,i+1);
        }
return result;
    }
}