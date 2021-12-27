/*Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1
characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive
(i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
 */
package String2;

public class repeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
    }

    public static String repeatFront(String str, int num) {
        String result="";
        for (int i = num; i >0 ; i--) {
            result=result+str.substring(0,i);//(0,4)+(0,3)+(0,2)+(0,1)

        }
        return result;
    }
}
