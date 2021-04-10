/*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length
will be at least 2.
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */
package string1;

public class right2 {
    public static void main(String[] args) {
        String output=right2("Hello");
        System.out.println(output);
        String output1=right2("java");
        System.out.println(output1);
        String output2=right2("Hi");
        System.out.println(output2);
    }
    public static String right2(String str){
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }
}
