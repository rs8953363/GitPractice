//Given a string, return a new string where the first and last chars have been exchanged.
//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"

public class frontBack {
    public static void main(String[] args) {
        String output = frontBack("code");
        System.out.println(output);
        String output1=frontBack("a");
        System.out.println(output1);
        String output2=frontBack("ab");
        System.out.println(output2);
    }

    public static String frontBack(String str) {
        if (str.length() >= 2)
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        else
            return str;
    }
}