/*Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its
left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */
package String2;
public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }
    public static String starOut(String str) {
        String result="";
        if (str.length()<=2)
            return str;
        for (int i = 2; i <str.length()-2 ; i++) {
            if (str.substring(i,i+1).equals("*"));
                result=result+str.substring(i-2,i-1)+str.substring(i+2,i+3);
        }
        return result;
    }
}
