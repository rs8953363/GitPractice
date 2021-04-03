/*Given three int values, a b c, return the largest.
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
public class intMax {
    public static void main(String[] args) {
        int output=intMax(1,2,3);
        System.out.println(output);
        int output1=intMax(1,3,2);
        System.out.println(output1);
        int output2=intMax(3,2,1);
        System.out.println(output2);
        int output3=intMax(5,2,1);
        System.out.println(output3);
    }

    public static int intMax(int a, int b, int c) {
        int max;
        if (a>b)
            max= a;
        else
            max=b;
      if (c>max)
            max=c;
        return max;
    }
}
