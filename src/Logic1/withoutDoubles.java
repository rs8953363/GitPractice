/*Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice
show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6

 */
package Logic1;

public class withoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(3, 3, false));
    }

    public static int withoutDoubles(int a, int b, boolean noDoubles) {
        if ((noDoubles) && (a==b))
            return a+b+1;
        else
            return a+b;

    }
}
