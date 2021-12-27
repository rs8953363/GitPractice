//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8
public class sumDouble {
    public static void main(String[] args) {
        int output=sumDouble(1,2);
        System.out.println(output);
        int output1=sumDouble(3,2);
        System.out.println(output1);
        int output2=sumDouble(2,2);
        System.out.println(output2);

    }
        public static int sumDouble(int a, int b) {
        if (a!=b)
            return a+b;
        else
            return 2*(a+b);
    }
}
