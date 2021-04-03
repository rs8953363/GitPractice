//Given an int n, return the absolute difference between n and 21, except return double the absolute
// difference if n is over 21.
//diff21(19) → 2
//diff21(10) → 11
//diff21(21) → 0
 public class diff21 {
    public static void main(String[] args) {
        int output = diff21(19);
        System.out.println(output);
        int output1=diff21(10);
        System.out.println(output1);
        int output2=diff21(21);
        System.out.println(output2);
    }
        public static int diff21(int n){
            if (n>21)
                return 2*(n-21);
            else
                return (21-n);
            //return Math.abs(n-21);
        }
    }
