/*Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class startHi {
    public static void main(String[] args) {
        boolean output=startHi("hi there");
        System.out.println(output);
        boolean output1=startHi("hi");
        System.out.println(output1);
        boolean output2=startHi("hello hi");
        System.out.println(output2);
        boolean output3=startHi("Hi");
        System.out.println(output3);
        boolean output4=startHi("h");
        System.out.println(output4);

    }
    public static boolean startHi(String str){
        if (str.length()<2)
                return false;
        if (str.substring(0,2).equals("hi"))
                return true;
        else
            return false;
    }
}
