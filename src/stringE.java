/*Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class stringE {
    public static void main(String[] args) {
        boolean output=stringE("Hello");
        System.out.println(output);
        boolean output1=stringE("Heelle");
        System.out.println(output1);
        boolean output2=stringE("Heelele");
        System.out.println(output2);
    }
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.substring(i,i+1).equals("e"))
            count++;
        }
        if ((count >= 1) && (count <= 3))
            return true;
        else
            return false;
    }
    }

