/*Given a string, return a string length 1 from its front, unless front is false, in which case return a string length
1 from its back. The string will be non-empty.
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
package string1;

public class theEnd {
    public static void main(String[] args) {
        String output=theEnd("Hello", true);
        System.out.println(output);
        String output1=theEnd("Hello", false);
        System.out.println(output1);
        String output2=theEnd("oh", true);
        System.out.println(output2);

    }
    public static String theEnd(String str, boolean a){
        if (a==true)
            return str.substring(0,1);
        else
            return str.substring(str.length()-1);

    }
}
