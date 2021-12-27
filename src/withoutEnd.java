/*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be
at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
public class withoutEnd {
    public static void main(String[] args) {
        String output=withoutEnd("Hello");
        System.out.println(output);
        String output1=withoutEnd("java");
        System.out.println(output1);
        String output2=withoutEnd("coding");
        System.out.println(output2);
    }
    public static String withoutEnd(String str){
        return str.substring(1,str.length()-1);
    }
}
