package quizTwo;

public class question6 {
    public static int ssn;
    public int age;

    public void print() {
        System.out.println(ssn+ ":" +age);
    }

    public static void main(String[] args) {
        question6 person=new question6();
        person.print();
        person.age=30;
        person.ssn=666;
        person.print();
        question6 person2=new question6();
        person2.age=60;
        person2.ssn=333;
        person.print();
        person2.print();
    }
}
