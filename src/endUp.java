/*Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars,
uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
public class endUp {
    public static void main(String[] args) {
        String output=endUp("Hello");
        System.out.println(output);
        String output1=endUp("hi there");
        System.out.println(output1);
        String output2=endUp("hi");
        System.out.println(output2);
    }
    public static String endUp(String str){
        if (str.length()>=3)
            return str.substring(0,str.length()-3)+str.substring((str.length()-3)).toUpperCase();
        else {
            return str.toUpperCase();
        }
    }
}
