/*Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too
small to define a string length 2, use the first 2 chars. The string length will be at least 2.
twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
 */
package string1;

public class twoChar {
    public static void main(String[] args) {
        String output=twoChar("java", 0);
        System.out.println(output);
        String output1=twoChar("java", 2);
        System.out.println(output1);
        String output2=twoChar("java", 3);
        System.out.println(output2);
    }

    public static String twoChar(String str, int num) {
        if (num>str.length()-2)
            return str.substring(0,2);
        else
              return  str.substring(num,num+2);

    }
}
