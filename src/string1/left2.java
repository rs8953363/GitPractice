/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
will be at least 2.
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
 */
package string1;

public class left2 {
    public static void main(String[] args) {
        String output=left2("Hello");
        System.out.println(output);
        String output1=left2("java");
        System.out.println(output1);
        String output2=left2("Hi");
        System.out.println(output2);

    }
    public static String left2(String str){
        if (str.length()>=2) {
            return str.substring(2,str.length()) + str.substring(0, 2);
        }else
            return str;
    }
}

