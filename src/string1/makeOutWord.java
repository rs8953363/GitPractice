/*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of
the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up
to but not including index j.
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"

 */
package string1;

public class makeOutWord {
    public static void main(String[] args) {
        String output=makeOutWord("<<>>", "Yay");
        System.out.println(output);
        String output1=makeOutWord("<<>>", "WooHoo");
        System.out.println(output1);
        String output2=makeOutWord("[[]]", "word");
        System.out.println(output2);

    }
    public static String makeOutWord(String str1, String str2){
        String result=str1.substring(0,str1.length()/2)+str2+str1.substring(str1.length()/2);
        return result;

    }
}
