/*Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with
"edited".
frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */
package string1;

public class frontAgain {
    public static void main(String[] args) {
        boolean output=frontAgain("edited");
        System.out.println(output);
        boolean output1=frontAgain("edit");
        System.out.println(output1);
        boolean output2=frontAgain("ed");
        System.out.println(output2);
    }
    public static boolean frontAgain(String str) {
        if ((str.length()>=0) && str.substring(0,2).equals(str.substring(str.length()-2)))
            return true;
        else
            return false;
    }
}
