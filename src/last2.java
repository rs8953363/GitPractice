/*Given a string, return the count of the number of times that a substring length 2 appears in the string and also as
the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
public class last2 {
    public static void main(String[] args) {
        int output=last2("hixxhi");
        System.out.println(output);
        int output1=last2("xaxxaxaxx");
        System.out.println(output1);
        int output2=last2("axxxaaxx");
        System.out.println(output2);
        int output3=last2("hi");
        System.out.println(output3);
        int output4=last2("x");
        System.out.println(output4);
        }

    public static int last2(String str){
        int count=0;
        if (str.length()>2) {
            for (int i = 0; i < str.length() - 2; i++)
                if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) {
                    count++;
                }
            return count;
        }else
            return 0;
    }
}