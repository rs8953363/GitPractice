/*Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
public class stringSplosion {
    public static void main(String[] args) {
    String output=stringSplosion("Code");
    System.out.println(output);
    String output1=stringSplosion("abc");
    System.out.println(output1);
    String output2=stringSplosion("ab");
    System.out.println(output2);
    }
    public static String stringSplosion(String str){
        String result="";
        for (int i=0; i<str.length(); i++){
            result=result+str.substring(0, i+1);
        }
        return result;
    }
}
