/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
-- see Introduction to Mod
or35(3) → true
or35(10) → true
or35(8) → false
 */
public class or35 {
    public static void main(String[] args) {
        boolean output=or35(3);
        System.out.println(output);
        boolean output1=or35(10);
        System.out.println(output1);
        boolean output2=or35(8);
        System.out.println(output2);

    }
    public static boolean or35(int num){
        if ((num%3==0) || (num%5==0))
            return true;
        else
            return false;
    }
}
