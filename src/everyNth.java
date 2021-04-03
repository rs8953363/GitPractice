/*Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the
string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */
public class everyNth {
    public static void main(String[] args) {
        String output=everyNth("Miracle", 2);
        System.out.println(output);
        String output1=everyNth("abcdefg", 2);
        System.out.println(output1);
        String output2=everyNth("abcdefg", 3);
        System.out.println(output2);
    }
    public static String everyNth(String str, int a) {
        String result="";
        for (int i = 0; i < str.length(); i=i+a) {
            result= result+str.substring(i,i+1);
        }
        return result;
    }
}
