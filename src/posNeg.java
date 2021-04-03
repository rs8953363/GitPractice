//Given 2 int values, return true if one is negative and one is positive. Except if the parameter
// "negative" is true, then return true only if both are negative.
//posNeg(1, -1, false) → true
//posNeg(-1, 1, false) → true
//posNeg(-4, -5, true) → true
public class posNeg {
    public static void main(String[] args) {
        boolean output=posNeg(1,-1,false);
        System.out.println(output);
        boolean output1=posNeg(-1,1,false);
        System.out.println(output1);
        boolean output2=posNeg(-4,-5,true);
        System.out.println(output2);
    }
    public static boolean posNeg(int a, int b, boolean c){
        if ((((a>0) && (b<0)) || ((a<0) && (b>0)))|| ((a<0) && (b<0) && (c==true)))
            return true;
            return false;
    }
}
