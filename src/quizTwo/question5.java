package quizTwo;

public class question5 {
    private static class Person {
        public Person (){
            System.out.println("I am a Person.");
        }
    }
    private static class Student extends Person{
        public Student (){
            System.out.println("I am a Student.");
        }
    }
    private static class CSStudent extends Student{
        public CSStudent (){
            System.out.println("I am a CSStudent.");
        }
    }
    public static void main(String[] args){
        CSStudent csStudent=new CSStudent();
    }
}