/*Given a string and a non-empty word string, return a string made of each char just before and just after every
appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be
included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"

 */
package String2;

public class wordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str, String word) {
        String result = "";
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            if (i > 0 && str.substring(i, i + word.length()).equals(word)) {
                result = result + str.substring(i - 1, i);
            }
            if ((i < str.length() - word.length()) && (str.substring(i, i + word.length()).equals(word))) {
                result = result + str.substring(i + word.length(), i + word.length() + 1);
            }
        }
        return result;
    }
}