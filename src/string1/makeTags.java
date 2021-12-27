/*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag
makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around
the word, e.g. "<i>Yay</i>".
makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
package string1;

public class makeTags {
    public static void main(String[] args) {
        String output=makeTags("i", "Yay");
        System.out.println(output);
        String output1=makeTags("i", "Hello");
        System.out.println(output1);
        String output2=makeTags("cite", "Yay");
        System.out.println(output2);

    }
    public static String makeTags(String str1, String str2){
        String result="<"+str1+">"+str2+"</"+str1+">";
        return result;
    }
}
