//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
        //monkeyTrouble(true, true) → true
       // monkeyTrouble(false, false) → true
       // monkeyTrouble(true, false) → false
public class monkeyTrouble {
    public static void main(String[] args) {
        boolean output=monkeyTrouble(true,true);
        System.out.println(output);
        boolean output1=monkeyTrouble(false,false);
        System.out.println(output1);
        boolean output2=monkeyTrouble(true, false);
        System.out.println(output2);

    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
            return true;
        }
        return false;

    }

}
