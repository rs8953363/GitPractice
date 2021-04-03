/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class stringTimes {
    public static void main(String[] args) {
        String output= stringTimes ("Hi", 2);
        System.out.println(output);
        String output1= stringTimes ("Hi", 3);
        System.out.println(output1);
        String output2= stringTimes ("Hi", 1);
        System.out.println(output2);
    }
    public static String stringTimes(String str, int a){
        String result="";
        for(int i=0; i<a; i++){
            result=result+str;
        }
         return result;
    }
}
