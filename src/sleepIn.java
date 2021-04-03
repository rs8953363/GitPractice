//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
      //  sleepIn(false, false) → true
      //  sleepIn(true, false) → false
      //  sleepIn(false, true) → true
public class sleepIn {
    public static void main(String[] args) {
        boolean output = sleepIn(true, true);
        System.out.println(output);
        boolean output2=sleepIn(false,false);
        System.out.println(output2);
        boolean output3=sleepIn(true,false);
        System.out.println(output3);
        boolean output4=sleepIn(false, true);
        System.out.println(output4);
    }
        //psvm--> shortcurt for main method
        public static boolean sleepIn(boolean weekday, boolean vacation){
            if (!weekday || vacation) {
                return true;
            }
                return false;
        }}

