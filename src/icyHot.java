/*Given two temperatures, return true if one is less than 0 and the other is greater than 100.
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */
public class icyHot {
    public static void main(String[] args) {
        boolean output=icyHot(120, -1);
        System.out.println(output);
        boolean output1= icyHot(-1, 120);
        System.out.println(output1);
        boolean output2=icyHot(2,120);
        System.out.println(output2);
    }
    public static boolean icyHot(int a, int b){
        if ((a<0) && (b>100) || (a>100) && (b<0))
            return true;
        else
            return false;
    }
}
