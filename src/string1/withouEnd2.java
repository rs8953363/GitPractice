/*Given a string, return a version without both the first and last char of the string. The string may be any length,
including 0.
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
package string1;

public class withouEnd2 {
    public static void main(String[] args){
        String output=withouEnd2("Hello");
        System.out.println(output);
        String output1=withouEnd2("abc");
        System.out.println(output1);
        String output2=withouEnd2("ab");
        System.out.println(output2);
}

public static String withouEnd2(String str){
        if ((str.length()>2))
             return str.substring(1,str.length()-1);
        else
            return "";
}
}
