/*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"

 */
package string1;

class helloName {
    public static void main(String[] args) {
        String output=helloName("Bob");
        System.out.println(output);
        String output1=helloName("Alice");
        System.out.println(output1);
        String output2=helloName("X");
        System.out.println(output2);
    }
    public static String helloName(String str){
        String result="";
        result="Hello " +str+"!";
        return result;
    }
}