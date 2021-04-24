/*The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum
or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
 */
package Logic1;

public class Love6 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));
    }
    public static boolean love6(int num1, int num2) {
        if ((num1==6) || (num2==6) || (num1+num2==6) || (Math.abs(num1-num2)==6))
            return true;
        else
            return false;

    }
}
