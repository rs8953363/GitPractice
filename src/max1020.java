/*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is
in that range.
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
public class max1020 {
    public static void main(String[] args) {
        int output = max1020(11, 19);
        System.out.println(output);
        int output1 = max1020(19, 11);
        System.out.println(output1);
        int output2 = max1020(11, 9);
        System.out.println(output2);
    }

    public static int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        } else if ((a >= 10 && a <= 20) && (b < 10 || b > 20)) {
            return a;
        } else if ((a < 10 || a > 20) && (b >= 10 && b <= 20)) {
            return b;
        } else {
            return 0;
        }
    }
}