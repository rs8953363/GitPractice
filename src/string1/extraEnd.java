/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */
package string1;

public class extraEnd {
    public static void main(String[] args) {
        String output=extraEnd("Hello");
        System.out.println(output);
        String output1=extraEnd("ab");
        System.out.println(output1);
        String output2=extraEnd("Hi");
        System.out.println(output2);
        String output3=extraEnd("H");
        System.out.println(output3);

    }
    public static String extraEnd(String str){
        String result="";
        if (str.length()>=2)
            for (int i = 0; i < 3; i++) {
                result = result + str.substring(str.length() - 2);
            }
            return result;
        }
}
