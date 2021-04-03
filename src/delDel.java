/*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
public class delDel {
    public static void main(String[] args) {
        String output = delDel("adelbc");
        System.out.println(output);
        String output1 = delDel("adelHello");
        System.out.println(output1);
        String output2 = delDel("adedbc");
        System.out.println(output2);
        String output3 = delDel("ade");
        System.out.println(output3);
    }

    public static String delDel(String str) {
        if (str.length() > 3) {
            if (str.substring(1, 4).equals("del"))
                return str.substring(0, 1) + str.substring(4, str.length());
                //return str.substring(0,1)+str.substring(4);
            else
                return str;
        } else
            return str;
    }
}
