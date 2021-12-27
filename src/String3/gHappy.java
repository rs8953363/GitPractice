/*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return
true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */
package String3;

public class gHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
    }
    public static boolean gHappy(String str) {
        boolean happy=true;
        for (int i = 1; i <str.length() ; i++) {
            if ((str.substring(i,i+1).equals("g")))
                if ((i>0) &&(str.substring(i-1,i).equals("g")))
                    happy=true;
            else if ((i<str.length()-1) && (str.substring(i+1, i+2).equals("g")))
                    happy= true;
                else
                    happy= false;
        }
return happy;
    }
}
