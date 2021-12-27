/*Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
package string1;

public class endsLy {
    public static void main(String[] args) {
        boolean output=endsLy("oddly");
        System.out.println(output);
        boolean output1=endsLy("y");
        System.out.println(output1);
        boolean output2=endsLy("oddy");
        System.out.println(output2);
    }
    public static boolean endsLy(String str) {
        if ((str.length()>=2) && (str.substring(str.length()-2).equals("ly")))
            return true;
        else
            return false;
    }
}
