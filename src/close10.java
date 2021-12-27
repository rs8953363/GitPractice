/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class close10 {
    public static void main(String[] args) {
        int output=close10(8,13);
        System.out.println(output);
        int output1=close10(13,8);
        System.out.println(output1);
        int output2=close10(13,7);
        System.out.println(output2);
        int output3=close10(11,11);
        System.out.println(output3);

    }
    public static int close10(int a, int b){
        if (Math.abs(a-10) < Math.abs(b-10))
            return a;
        else if (Math.abs(a-10) > Math.abs(b-10))
            return b;
        else
            return 0;
    }
}
