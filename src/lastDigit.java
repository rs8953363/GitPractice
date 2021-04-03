/*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the
% "mod" operator computes remainders, so 17 % 10 is 7.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
public class lastDigit {
    public static void main(String[] args) {
        boolean output=lastDigit(7,17);
        System.out.println(output);
        boolean output1=lastDigit(6,17);
        System.out.println(output1);
        boolean output2=lastDigit(3,113);
        System.out.println(output2);
    }
    public static boolean lastDigit(int a, int b){
        if((a%10)==(b%10))
            return  true;
        else
            return  false;
    }
}
