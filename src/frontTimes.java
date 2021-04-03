/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is
there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class frontTimes {
    public static void main(String[] args) {
        String output=frontTimes("Chocolate", 2);
        System.out.println(output);
        String output1=frontTimes("Chocolate", 3);
        System.out.println(output1);
        String output2=frontTimes("Abc", 3);
        System.out.println(output2);
        String output3=frontTimes("C", 3);
        System.out.println(output3);
    }
    public static String frontTimes(String str, int a){
        String result= "";
        if (str.length()>=3){
        for (int i=0; i<a; i++){
            result=result+str.substring(0,3);
        }
        return result;
    }else
            for (int i=0; i<a; i++){
                result=result+str;
            }
   return result;
}
        }
