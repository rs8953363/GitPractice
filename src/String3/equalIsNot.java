/*Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of
appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */
package String3;

public class equalIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

    public static boolean equalIsNot(String str) {
        int count1=0;
        int count2=0;
        for (int i = 0; i <str.length()-2; i++) {
            if ((str.length()>=i+2) && (str).substring(i, i+2).equals("is"))
                count1++;
            if ((str.length()>=i+3) && (str.substring(i, i+3).equals("not")))
                count2++;
        }
       if (count1==count2)
           return true;
       else
           return false;

    }
}
