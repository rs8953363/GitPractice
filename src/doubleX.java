/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class doubleX {
    public static void main(String[] args) {
        boolean output = doubleX("axxbb");
        System.out.println(output);
        boolean output1 = doubleX("axaxax");
        System.out.println(output1);
        boolean output2 = doubleX("xxxxx");
        System.out.println(output2);
        boolean output3 = doubleX("");
        System.out.println(output3);
        boolean output4 = doubleX("abc");
        System.out.println(output4);
        boolean output5 = doubleX("x");
        System.out.println(output5);
    }
    public static boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx"))
                return true;
        }return false;
    }
}