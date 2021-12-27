//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat"
// yields "tcatt". The original string will be length 1 or more.
//backAround("cat") → "tcatt"
//backAround("Hello") → "oHelloo"
//backAround("a") → "aaa"

public class backAround {
    public static void main(String[] args) {
        String output=backAround("cat");
        System.out.println(output);
        String output1=backAround("Hello");
        System.out.println(output1);
        String output2=backAround("a");
        System.out.println(output2);
    }
    public static String backAround(String str){
        return str.substring(str.length()-1)+str+str.substring(str.length()-1);
    }
}
