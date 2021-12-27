/*We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the
given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 */
package String3;

public class countTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }
    public static int countTriple(String str) {
        int count=0;
        for (int i = 0; i < str.length()-2; i++) {
            if ((str.substring(i,i+1).equals(str.substring(i+1,i+2))) && (str.substring(i,i+1).equals(str.substring(i+2,i+3))))
                count++;
        }
        return count;
    }
}
