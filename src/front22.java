/*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
public class front22 {
    public static void main(String[] args) {
        String output=front22("kitten");
        System.out.println(output);
        String output1=front22("Ha");
        System.out.println( output1);
        String output2=front22("abc");
        System.out.println(output2);
    }
    public static String front22(String str){
       if (str.length()>=2)
            return str.substring(0,2)+str+str.substring(0,2);
       else
           return str+str+str;
    }
}
