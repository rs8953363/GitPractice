//Given a string, return a new string where "not " has been added to the front. However, if the string already begins
// with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
//notString("candy") → "not candy"
//notString("x") → "not x"
//notString("not bad") → "not bad"
public class notString {
    public static void main(String[] args) {
        String output = notString("candy");
        System.out.println(output);
        String output1=notString("x");
        System.out.println(output1);
        String output2=notString("not bad");
        System.out.println(output2);
    }

    public static String notString(String a) {
        if (a.length() >= 3 && a.substring(0, 3).equals("not")) {
            return a;
        } else
            return "not " + a;

    }
}
