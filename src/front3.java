//Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
// the front is whatever is there. Return a new string which is 3 copies of the front.
//front3("Java") → "JavJavJav"
//front3("Chocolate") → "ChoChoCho"
//front3("abc") → "abcabcabc"

public class front3 {
    public static void main(String[] args) {
        String output=front3("Java");
        System.out.println(output);
        String output2=front3("Chocolate");
        System.out.println(output2);
        String output3=front3("abc");
        System.out.println(output3);
    }
    public static String front3(String str){
        if (str.length()<3)
                return str;
        else
            return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
    }

}
