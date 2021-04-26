/*We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */
package Logic2;

import javax.swing.*;

public class makeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }

    public static int makeChocolate(int small, int big, int goal) {
        if (goal >= (5*big)) {
            return (goal - 5 * big);
        }else{
            return goal % 5;
        }
       // if ((goal-5*big) <= small)
           // return (goal-5*big);

     //   return -1;
    }
}
