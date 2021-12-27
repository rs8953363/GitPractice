/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
public class countXX {
    public static void main(String[] args) {
        int output=countXX("abcxx");
        System.out.println(output);
        int output1=countXX("xxx");
        System.out.println(output1);
        int output2=countXX("xxxx");
        System.out.println(output2);
        int output3=countXX("ax");
        System.out.println(output3);

    }
    public static int countXX(String str) {
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("xx"))
                count ++;
        }
        return count;
    }
    }
