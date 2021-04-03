/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public class mixStart {
    public static void main(String[] args) {
        boolean output=mixStart("mix snacks");
        System.out.println(output);
        boolean output1=mixStart("pix snacks");
        System.out.println(output1);
        boolean output2=mixStart("piz snacks");
        System.out.println(output2);
        boolean output3=mixStart("pi");
        System.out.println(output3);
    }

    public static boolean mixStart(String str){
        if ((str.length()>=3) && (str.substring(1,3).equals("ix")))
            return true;
        else
            return false;
    }
}
