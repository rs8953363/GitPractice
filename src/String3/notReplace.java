/*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". 
The word "is" should not be immediately proceeded or followed by a letter -- so for example the "is" in "this" does not 
count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */
package String3;

public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String str) {
        String result= "";
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+2).equals("is") )
                if (Character.isLetter(i+2)){
                  result=result+ str.charAt(i);
            }else{
                result=result+ "is not"+str.substring(i+2);
            }
        }
     return result;
    }
}
   /* public String notReplace(String str) {
        String result="";
        for (int i=0; i<str.length(); i++){
            if (i-1>=0 && Character.isLetter(str.charAt(i-1)) || i<str.length()-2 && Character.isLetter(str.charAt(i+2))){
                result=result+str.charAt(i);
            }else if (i<str.length() && str.substring(i,i+2).equals("is")){
                result=result+"is not";
                i++;
            }
            else
                result=result+str.charAt(i);
        }
        return result;
    }*/