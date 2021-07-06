/*Given an array of strings, return a new array without the strings that are equal to the target string. One approach
 is to count the occurrences of the target string, make a new array of the correct length, and then copy over the
 correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */
package AP1;

public class wordsWithout {
    public static void main(String[] args) {
        String[] array1={"a", "b", "c", "a"};
        String[] output1=wordsWithout(array1, "a");
        System.out.println(output1);

        String[] array2={"a", "b", "c", "a"};
        String[] output2=wordsWithout(array2, "b");
        System.out.println(output2);

        String[] array3={"a", "b", "c", "a"};
        String[] output3=wordsWithout(array3, "c");
        System.out.println(output3);
    }

    public static String[] wordsWithout(String[] words, String target) {
        String[] arr=new String[words.length-(2*target.length())];
        for (int i = 0; i <words.length ; i++) {
            if (words[i]!=target)
                arr[i]=words[i];
        }
        return arr;
    }
}
