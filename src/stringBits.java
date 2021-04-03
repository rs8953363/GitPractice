/*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public class stringBits {
    public static void main(String[] args) {
        String output = stringBits("Hello");
        System.out.println(output);
        String output1 = stringBits("Hi");
        System.out.println(output1);
        String output2 = stringBits("Heeololeo");
        System.out.println(output2);
    }

    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }
}