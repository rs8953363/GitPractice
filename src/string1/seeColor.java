/*Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */
package string1;

public class seeColor {
    public static void main(String[] args) {
        String output=seeColor("redxx");
        System.out.println(output);
        String output1=seeColor("xxred");
        System.out.println(output1);
        String output2=seeColor("blueTimes");
        System.out.println(output2);
    }
    public static String seeColor(String str) {
        if (str.substring(0,3).equals("red"))
            return "red";
        else if (str.substring(0,4).equals("blue"))
            return "blue";
        else
            return "";

    }
}
