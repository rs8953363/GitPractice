/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by
the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */
package String2;

public class repeatSeperator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2) );
        System.out.println(repeatSeparator("This", "And", 1));
    }

    public static String repeatSeparator(String str, String word, int sep) {
        String result="";
        if (sep>=1){
        for (int i = 0; i <sep-1; i++) { //wordxwordxwordx
            result=result+str+word;

        }
        result=result+str;
        return result;
    }else
        return "";

    }
}
