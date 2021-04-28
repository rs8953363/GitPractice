/*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */
package String2;

public class getSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread") );
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

    public static String getSandwich(String str) {
        for (int i = 0; i < str.length()-4 ; i++) {
            if (str.length()>=5 && str.substring(i,i+5).equals("bread"))
                if (str.lastIndexOf("bread") !=-1 && str.lastIndexOf("bread")>i+5)
                    return str.substring(i+5, str.lastIndexOf("bread"));
        }
        return "";
    }
}
