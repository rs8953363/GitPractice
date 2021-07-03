package quizTwo;

public class question7 {
    public static void main(String[] args) {
        String name=" Juia ";
        name.trim();
        String surName=" ";
        surName.trim();

        if (surName.equals("")){
            System.out.println( "Hello" +name);
        }else if (surName.isEmpty()){
            System.out.println( "Hi" +name);
        }else {
            System.out.println( "Come" +name);
        }
    }
}
