/*The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers"
array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are
the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect
answer, and +0 for each blank answer.

scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
 */
package AP1;

public class scoreUp {
    public static void main(String[] args) {
        String[] array1={"a", "a", "b", "b"};
        String[] array2={"a", "c", "b", "c"};
        int output1 = scoreUp(array1, array2);
        System.out.println(output1);

        String[] array3={"a", "a", "b", "b"};
        String[] array4={"a", "a", "b", "c"};
        int output2 = scoreUp(array3, array4);
        System.out.println(output2);

        String[] array5={"a", "a", "b", "b"};
        String[] array6={"a", "a", "b", "b"};
        int output3 = scoreUp(array5, array6);
        System.out.println(output3);
    }

    public static int scoreUp(String[] key, String[] answers){
        int score=0;
        for (int i = 0; i <key.length ; i++) {
            if ((key[i]== "?") || (answers[i]=="?"))
                score=score+0;
            else if (key[i]==answers[i])
                score=score+4;
            else
                score=score-1;
        }
        return score;
    }
}
