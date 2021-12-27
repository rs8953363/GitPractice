//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
//parrotTrouble(false, 6) → false

public class parrotTrouble {
    public static void main(String[] args) {
        boolean output=parrotTrouble(true,6);
        System.out.println(output);
        boolean output1=parrotTrouble(true, 7);
        System.out.println(output1);
        boolean output2=parrotTrouble(false,6);
        System.out.println(output2);
    }
    public static boolean parrotTrouble(boolean talking, int time){
        if((talking && (time<7)) || ((talking ==true)&& (time>20)))
                return true;
        else
                return false;

}}
