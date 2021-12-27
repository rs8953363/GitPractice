/*Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o'
and include the second only if it is 'z', so "ozymandias" yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/
public class startOz {
    public static void main(String[] args) {
        String output=startOz("ozymandias");
        System.out.println(output);
        String output1=startOz("bzoo");
        System.out.println(output1);
        String output2=startOz("oxx");
        System.out.println(output2);
        String output3=startOz("o");
        System.out.println(output3);
    }
 public static String startOz(String str){
        if (str.length()>=2) {
         if (str.substring(0, 2).equals("oz"))
             return "oz";
         else if (str.substring(0, 1).equals("o"))
             return "o";
         else if (str.substring(1, 2).equals("z"))
             return "z";
         else
             return " ";
     }else
         return " ";

 }
}
