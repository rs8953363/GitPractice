/*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length
will be at least 3.
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
package string1;

public class middleThree {
    public static void main(String[] args) {
        String output=middleThree("Candy");
        System.out.println(output);
        String output1=middleThree("and");
        System.out.println(output1);
        String output2=middleThree("solving");
        System.out.println(output2);
    }
    public static String middleThree(String str) {
        if (str.length()%2!=0)
            return str.substring(str.length()/2-1,str.length()/2+2);
        return null;
    }
}
