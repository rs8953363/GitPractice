//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false
public class nearHundred {
    public static void main(String[] args) {
        boolean output=nearHundred(93);
        System.out.println(output);
        boolean output1=nearHundred(90);
        System.out.println(output1);
        boolean output2=nearHundred(89);
        System.out.println(output2);
    }
    public static boolean nearHundred(int n){
        if ((Math.abs(100-n)<=10)||(Math.abs(200-n)<=10))
                return true;
                return false;
    }
}
