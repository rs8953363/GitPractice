//We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 2 int values, return true if one or the other is teen, but not both.
        //loneTeen(13, 99) → true
        //loneTeen(21, 19) → true
        //loneTeen(13, 13) → false

public class loneTeen {
    public static void main(String[] args) {
        boolean output=loneTeen(13, 99);
        System.out.println(output);
        boolean output1=loneTeen(21,19);
        System.out.println(output1);
        boolean output2=loneTeen(13,13);
        System.out.println(output2);
        }
        public static boolean loneTeen(int a, int b) {
            boolean aTeen=(a>=13 && a<=19);
            boolean bTeen=(b>=13 && b<=19);
            if((aTeen && !bTeen) || (!aTeen && bTeen)){
                return true;
            }else{
                return false;
            }
        }
    }

