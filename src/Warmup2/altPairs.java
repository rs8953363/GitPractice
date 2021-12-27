/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
package Warmup2;

public class altPairs {
    public static void main(String[] args) {
        String output=altPairs("kitten");
        System.out.println(output);
        String output2=altPairs("Chocolate");
        System.out.println(output2);
        String output3=altPairs("CodingHorror");
        System.out.println(output3);
    }
    public static String altPairs(String str){
        String result="";
        for (int i=0; i<str.length()-1;i+=4){
            result= result+ str.substring(i,i+2);
        }
        return result;
    }
}

