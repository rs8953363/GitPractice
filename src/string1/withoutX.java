/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return
the string unchanged.
withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
package string1;

public class withoutX {
    public static void main(String[] args) {
        String output=withoutX("xHix");
        System.out.println(output);
        String output1=withoutX("xHi");
        System.out.println(output1);
        String output2=withoutX("Hxix");
        System.out.println(output2);

    }
    public static String withoutX(String str) {
        if (str.length()>1){
            if ((str.substring(0,1).equals("x")) && (str.substring(str.length()-1).equals("x")))
                return str.substring(1,str.length()-1);
            else if (str.substring(0,1).equals("x"))
                return str.substring(1);
            else if (str.substring(str.length()-1).equals("x"))
                return str.substring(0,str.length()-1);
            else
                return str;
        }else if (str.equals("x"))
            return "";
        else
            return str;
    }
}
