/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are
the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */
package String3;

public class maxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));

    }

    public static int maxBlock(String str) {
        int count=1;
        int max=0;
        if (str.length()==0)
            return 0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if ((str.substring(i,i+1).equals(str.substring(i+1,i+2))))
                count++;
            else
                count=1;
            if (count>max)
                max=count;
        }
        return max;
    }
}

