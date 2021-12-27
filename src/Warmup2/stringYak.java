/*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the
"a" can be any char. The "yak" strings will not overlap.
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
package Warmup2;

public class stringYak {
    public static void main(String[] args) {
        String output=stringYak("yakpak");
        System.out.println(output);
        String output1=stringYak("pakyak");
        System.out.println(output1);
        String output2=stringYak("yak123ya");
        System.out.println(output2);
        String output3=stringYak("yak$");
        System.out.println(output3);
    }
    public static String stringYak(String str){
        String result="";
        for (int i=0;i<str.length();i++){
            if((str.length()>i+2)&&((str.substring(i,i+1).equals("y"))) && ((str.substring(i+2,i+3).equals("k"))))
                i=i+2;

            else
                result=result+ str.substring(i,i+1);
        }
        return result;
    }
}

