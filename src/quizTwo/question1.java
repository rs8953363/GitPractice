package quizTwo;

public class question1 {
    String name;

    public question1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        question1 person = new question1("John");
        System.out.println(person.name);
    }
}