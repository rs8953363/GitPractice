/*Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50
inclusive.
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */
public class in3050 {
    public static void main(String[] args) {
        boolean output=in3050 (30,31);
        System.out.println(output);
        boolean output1=in3050 (30,41);
        System.out.println(output1);
        boolean output2=in3050 (40,50);
        System.out.println(output2);
    }
    public static boolean in3050 (int a, int b){
        if(((a>=30) && (a<=40) && (b>=30) && (b<=40)) || ((a>=40) && (a<=50) && (b>=40) && (b<=50)))
            return true;
        else
            return false;
    }
}
