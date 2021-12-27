/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
package string1;

public class firstHalf {
    public static void main(String[] args) {
        String output=firstHalf("WooHoo");
        System.out.println(output);
        String output1=firstHalf("HelloThere");
        System.out.println(output1);
        String output2=firstHalf("abcdef");
        System.out.println(output2);

    }
    public static String firstHalf(String str){
        return str.substring(0,str.length()/2);
    }
}
